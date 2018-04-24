package com.ifrdh.column2property.raoutputview;

import com.ifrdh.column2property.models.Phase2OutputColumnEntity;
import com.ifrdh.column2property.utils.SizedBuffer;
import com.ifrdh.column2property.utils.SizedBufferWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;

@Component
public class RAOutputViewGenerator {

    @Autowired
    public void setEntityManager(EntityManager em){
        entityManager = em;
    }

    @Autowired
    public void setEnv(Environment env){
        this.env = env;
    };

    private static Environment env;

    private static EntityManager entityManager;

    private static String fileName;

    private static HashMap<String, Boolean> foundColumnName;

    @Value("${raViewScript}")
    public void setFileName(String outputFileName){
        fileName = outputFileName;
    };

    public void RAOutputViewGenerator() throws Exception{

    }

    static {
        foundColumnName = new HashMap<>();
    }

    public static  void generate() throws Exception{
//        SizedBufferWriter sizedBufferFileWriter = new SizedBufferWriter(fileName);
//        sizedBufferFileWriter.setSizedBuffer(new SizedBuffer(100));
        PrintStream fileWriter = new PrintStream(fileName);

        Query query = entityManager.createQuery("SELECT e from Phase2OutputColumnEntity e WHERE e.excelFileId = :fileId and e.phase2TableName = :tableName " +
                "and e.isDirectOutput = :isDirectOutput");
        query.setParameter("fileId", 1);
        query.setParameter("tableName", "RAOutputView");
        query.setParameter("isDirectOutput", true);
        List<Phase2OutputColumnEntity> columns = query.getResultList();

        fileWriter.println(String.format("ALTER VIEW %s", env.getProperty("raViewName")));
        fileWriter.println("AS");
        fileWriter.println("Select ");

        String columnName = "";
        String displayName;
        int total = columns.size();
        int count = 0;
        for(Phase2OutputColumnEntity column : columns ){
            columnName = column.getPhase2ColumnName();
            displayName = column.getDisplayName().replace(" ", "").replace("/", "");
            if(!foundColumnName.containsKey(columnName.toLowerCase())) {
                foundColumnName.put(columnName.toLowerCase(), true);
                if (count != 0)
                    fileWriter.println(",");
                fileWriter.print("\t\t");
                if (columnName.indexOf("2.5.2.20") != -1) {
                    fileWriter.print(String.format("%s(%s, %s) as %s", "dbo." + displayName + "_RA", "activeOrLiquidatedEnriched", "LiquidationDate", displayName));
                } else if (columnName.indexOf("2.5.2.17") != -1) {
                    fileWriter.print(String.format("%s(%s) as %s", "dbo." + displayName + "_RA", "InvestmentStructure3", displayName));
                } else if (columnName.indexOf("2.5.2.18") != -1) {
                    fileWriter.print(String.format("%s(%s) as %s", "dbo." + displayName + "_RA", "InvestmentStructure3", displayName));
                } /*else if (columnName.toLowerCase().indexOf("purchase") != -1)
                    fileWriter.print(String.format(" 'SomeValue' as %s", columnName));*/
                else
                    fileWriter.print(columnName);
                count++;
            }
        }
        fileWriter.println("");

        fileWriter.println("from EnrichedData");
        fileWriter.close();
    }
}
