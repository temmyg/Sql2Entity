package com.ifrdh.column2property.Enrichment;

import com.ifrdh.column2property.models.EnrichmentRequirementEntity;
import com.ifrdh.column2property.repositories.EnrichmentRequirementRepo;
import com.ifrdh.column2property.utils.SizedBufferWriter;
import javafx.util.Pair;
import org.apache.commons.lang3.BooleanUtils;
import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class EnrichmentScriptGenerator {

    @Autowired
    EnrichmentRequirementRepo enrichmentRequirementColsRepo;

    @Autowired
    @Qualifier("enrichSizedWriter")
    SizedBufferWriter enrichInsertScriptFile;

    @Autowired
    org.springframework.core.env.Environment env;

    @Value("${enrichmentTableName}")
    String enrichmentTableName;

    @Value("${normalizationTableName}")
    String normalizationTableName;

    // Normalization Col - TableName, SqlType
    Map<String, Pair<String, String>> normalizationEnrichmentMapping = new HashMap<>();

    public void makeEnrichmentScripts(List<Pair<String, Pair<String, String>>> normColumns) throws Exception {
        List<EnrichmentRequirementEntity> enrichmentRequirementColumns = enrichmentRequirementColsRepo.findAll();

        // key: standardizedNorm Column name, value: table name, normlization column name
        Map<String, EnrichmentRequirementEntity> tableSuffixedEnrichColsMap = new HashMap<>();

        String colName, tblName;
        for (EnrichmentRequirementEntity col : enrichmentRequirementColumns) {
            colName = col.getColumnName();
            if(colName != null && !colName.toLowerCase().contains("calculated")) {
                tblName = col.getIFRETableName();

                colName = (colName + '_' + tblName).toLowerCase();
                tableSuffixedEnrichColsMap.put(colName, col);
            }
        }

        // tableName suffixed ColumnName - Normlization Table Column name, source table name, sqltype
        Map<String, Pair<String, Pair<String, String>>> tableSuffixedNormColsMap = new HashMap<String, Pair<String, Pair<String, String>>>();
        for (Pair<String, Pair<String, String>> normCol : normColumns) {
            colName = normCol.getKey();
            tblName = normCol.getValue().getKey();

            if (colName.indexOf(tblName) == -1) {
                colName = colName + "_" + tblName;
            }
            tableSuffixedNormColsMap.put(colName, normCol);
        }

        EnrichmentRequirementEntity enrichCol;
        Pair<String, Pair<String, String>> normCol;
        for (String tableSuffixedColName : tableSuffixedEnrichColsMap.keySet()) {
            enrichCol = tableSuffixedEnrichColsMap.get(tableSuffixedColName);
            normCol = tableSuffixedNormColsMap.get(tableSuffixedColName);
            try {
                // not calculated enrichrequirement column only
                if (BooleanUtils.isFalse(enrichCol.getIsCalculated()))
                    if (normCol == null)  // this column is not found in normalization requirement table
                    {
                        throw new Exception(String.format("Table Suffixed Enrich Column %s not found in  Normalization table", tableSuffixedColName));
                    }
                    else
                        normalizationEnrichmentMapping.put(normCol.getKey(), normCol.getValue());
            } catch (Exception ex) {
                throw ex;
            }
        }

        makeCreateTableScript(enrichmentRequirementColumns, tableSuffixedNormColsMap);

        makeInsertionEnrichmentScript();
    }

    public void makeCreateTableScript(List<EnrichmentRequirementEntity> enrichmentRequirementColumns, Map<String, Pair<String, Pair<String, String>>>  tableSuffixedNormCols) throws Exception {

        PrintStream fileAppender = new PrintStream(env.getProperty("enrichmentTableCreationScript"));

        fileAppender.println("Use " + env.getProperty("databaseName"));
        fileAppender.println(String.format("Drop Table %s%n", enrichmentTableName));
        fileAppender.println(String.format("CREATE TABLE %s (", enrichmentTableName));
        fileAppender.println(String.format("\tImportId bigint,"));
        fileAppender.println(String.format("\tID bigint IDENTITY(1,1) NOT NULL,"));
        fileAppender.println(String.format("\tCONSTRAINT PK_%s PRIMARY KEY CLUSTERED (%s),", enrichmentTableName, "ID"));

        int i = 0;
        for (String normColName : normalizationEnrichmentMapping.keySet()) {
            i++;
            fileAppender.print(String.format("\t%s %s", normColName, normalizationEnrichmentMapping.get(normColName).getValue()));
            if (i != normalizationEnrichmentMapping.size())
                fileAppender.println(",");
            else
                fileAppender.println(",");
        }

        // Add Calculation properties
        String columnName = null, presentationName;
        int calculatedTotal = 0;
        for(EnrichmentRequirementEntity col : enrichmentRequirementColumns){
            if(col.getIsCalculated())
                calculatedTotal++;
        }
        int colCount = 0;
        String sqlType = "float";
        for (EnrichmentRequirementEntity col : enrichmentRequirementColumns) {
            if (col.getIsCalculated()) {
                colCount++;
                columnName = col.getColumnName();
                presentationName = col.getPresentationName();
                if (columnName.indexOf("calculated") != -1)
                    columnName = presentationName.replace("(", "").replace(")", "").replace(" ", "_");
                //TODO: data type
                sqlType = getSqlType(columnName, tableSuffixedNormCols);
                fileAppender.print(String.format("\t%s %s", columnName, sqlType));
                if(colCount!=calculatedTotal)
                    fileAppender.println(",");
                else
                    fileAppender.println(")");
            }
        }

        fileAppender.close();
    }

    public void makeInsertionEnrichmentScript() throws Exception {
        enrichInsertScriptFile.write(String.format("ALTER procedure [dbo].[LoadEnrichmentTable] as%n"));
        enrichInsertScriptFile.write(String.format("begin%n"));
        enrichInsertScriptFile.write(String.format("set nocount on%n%n"));
        enrichInsertScriptFile.write(String.format("declare @importid bigint%n"));
        enrichInsertScriptFile.write(String.format(" select  @importid = max(importid) from dbo.IFRDH_Import where importtype = 'REImport'%n%n"));
        enrichInsertScriptFile.write(String.format("Insert Into %s (", enrichmentTableName));
        enrichInsertScriptFile.write("importid,");

        String colName;
        int totalCols = normalizationEnrichmentMapping.size();
        int loop = 0;
        for (Map.Entry entry : normalizationEnrichmentMapping.entrySet()) {
            loop++;
            enrichInsertScriptFile.write(entry.getKey().toString());
            if (loop < totalCols)
                enrichInsertScriptFile.write(",");
            else
                enrichInsertScriptFile.write(")");
        }
        enrichInsertScriptFile.write("\r\n Select ");
        enrichInsertScriptFile.write("@importid, ");
        loop = 0;
        for (Map.Entry entry : normalizationEnrichmentMapping.entrySet()) {
            loop++;
            enrichInsertScriptFile.write(entry.getKey().toString());
            if (loop < totalCols)
                enrichInsertScriptFile.write(",");
            else
                enrichInsertScriptFile.write(" ");
        }

        enrichInsertScriptFile.write(String.format(" From %s where ilevel_dif_ifre_assets = 'IL'%n", normalizationTableName));
        enrichInsertScriptFile.write(String.format("update Enrichment_PhaseII set assetcode_1 = assetcode;%n"));
        enrichInsertScriptFile.write(String.format("end%n"));
        enrichInsertScriptFile.close();
    }

    // table suffixed column name, normalization table column name, source table, sql data type
    private String getSqlType(String columnName, Map<String, Pair<String, Pair<String, String>>> table_suffixed_normCols){
        String sqlType = "float";
        columnName = columnName.toLowerCase();
        if(columnName.indexOf("assetcode")!=-1)
            sqlType = table_suffixed_normCols.get("assetcode_dif_ifre_assets").getValue().getValue();
        if(columnName.indexOf("investment_type")!=-1)
            sqlType = table_suffixed_normCols.get("sector_focus_dif_ifre_df2").getValue().getValue();
        if(columnName.indexOf("business_group")!=-1)
            sqlType = "varchar(50)";
        if(columnName.indexOf("business_sub_group")!=-1)
            sqlType = table_suffixed_normCols.get("business_unit_dif_ifre_df2").getValue().getValue();
        if(columnName.indexOf("investment_reporting_currency")!=-1)
            sqlType = table_suffixed_normCols.get("reportingcurrencyal_dif_ifre_assets").getValue().getValue();
        return sqlType;
    }
}
