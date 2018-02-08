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
            tblName = col.getIFRETableName();

            colName = (colName + '_' + tblName).toLowerCase();
            tableSuffixedEnrichColsMap.put(colName, col);
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
                if (BooleanUtils.isFalse(enrichCol.getIsCalculated()))
                    if (normCol == null)
                        throw new Exception(String.format("Table Suffixed Enrich Column %s not found in  Normlization table", tableSuffixedColName));
                    else
                        normalizationEnrichmentMapping.put(normCol.getKey(), normCol.getValue());
            } catch (Exception ex) {
                throw ex;
            }
        }

//        for(Pair<String, String> col : normColumns){
//            // always add lowercase value as key
//            standardizedNormColumns.put(col.getKey() + '_' + col.getValue(), new Pair<>());
//        }

//        String colName, requirementColName, tblName;
//        Pair<String, Boolean> enrichCol;
//
//        for (Pair<String, String> normCol : normColumns) {
//            try {
//                colName = normCol.getKey();
//                tblName = normCol.getValue();
//
//                // requirementColName only has column name, it does not have (underscore + table name) suffix
//                requirementColName = removeTblName(colName, tblName);
//                enrichCol = enrichedColumns.get(requirementColName);
//
//                if (enrichCol == null)
//                    throw new Exception(String.format("%s not found in Enrich Columns", requirementColName));
//
//                if (BooleanUtils.isFalse(enrichCol.getValue()))
//                    normalizationEnrichmentMapping.put(colName, requirementColName);
//            } catch (Exception e) {
//                int i1 = 0;
//            }
//
//        }

        makeCreateTableScript(enrichmentRequirementColumns);

        makeInsertionEnrichmentScript();
    }

    public void makeCreateTableScript(List<EnrichmentRequirementEntity> enrichmentRequirementColumns) throws Exception {

        PrintStream fileAppender = new PrintStream(env.getProperty("enrichmentTableCreationScript"));

        fileAppender.println("Use " + env.getProperty("databaseName"));
        fileAppender.println(String.format("Drop Table %s%n", enrichmentTableName));
        fileAppender.println(String.format("Create Table %s (", enrichmentTableName));

        int i = 0;
        for (String normColName : normalizationEnrichmentMapping.keySet()) {
            i++;
            fileAppender.print(String.format("\t%s %s", normColName, normalizationEnrichmentMapping.get(normColName).getValue()));
            if (i != normalizationEnrichmentMapping.size())
                fileAppender.println(",");
            else
                fileAppender.println(",");
        }

        String columnName = null, presentationName;
        int calculatedTotal = 16;
        int colCount = 0;
        for (EnrichmentRequirementEntity col : enrichmentRequirementColumns) {
            if (col.getIsCalculated()) {
                colCount++;
                columnName = col.getColumnName();
                presentationName = col.getPresentationName();
                if (columnName.indexOf("calculated") != -1)
                    columnName = presentationName.replace("(", "").replace(")", "").replace(" ", "_");
                fileAppender.print(String.format("\t%s %s", columnName, "float"));
                if(colCount!=calculatedTotal)
                    fileAppender.println(",");
                else
                    fileAppender.println(")");
            }
        }

        fileAppender.close();
    }

    public void makeInsertionEnrichmentScript() throws Exception {

        enrichInsertScriptFile.write(String.format("Insert Into %s (", enrichmentTableName));

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

        loop = 0;
        for (Map.Entry entry : normalizationEnrichmentMapping.entrySet()) {
            loop++;
            enrichInsertScriptFile.write(entry.getKey().toString());
            if (loop < totalCols)
                enrichInsertScriptFile.write(",");
            else
                enrichInsertScriptFile.write(" ");
        }

        enrichInsertScriptFile.write(String.format(" From %s ", normalizationTableName));
        enrichInsertScriptFile.close();
    }
}
