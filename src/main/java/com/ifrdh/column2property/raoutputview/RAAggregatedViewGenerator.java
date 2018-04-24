package com.ifrdh.column2property.raoutputview;


import com.ifrdh.column2property.models.Phase2OutputColumnEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class RAAggregatedViewGenerator {
    List<Phase2OutputColumnEntity> outputColumns;

    @Autowired
    Environment env;

    @Autowired
    EntityManager entityManager;

    public void generateViewScript() throws Exception {
        String fileName = env.getProperty("raAggregatedViewFileName");
        PrintStream fileAppender = new PrintStream(fileName);

        Query q1 = entityManager.createQuery("select e from Phase2OutputColumnEntity e where e.excelFileId=1 and e.phase2TableName='Enrichment_Phaseii'"
                //       + " and e.isDirectOutput=1"
                + " order by e.orderNumberInSheet");
        //q.setParameter("tableName", "Enrichment_Phaseii");
        List<Phase2OutputColumnEntity> colRA1 = q1.getResultList();

        Query q2 = entityManager.createQuery("select e from Phase2OutputColumnEntity e where e.excelFileId=1 " +
                "and e.phase2TableName='RAOutputView' and e.isDirectOutput=1 order by e.orderNumberInSheet");

        List<Phase2OutputColumnEntity> colRA2 = q2.getResultList();
        Map<Integer, String> iFPICols = new HashMap<>();
        for (Phase2OutputColumnEntity col : colRA2) {
            iFPICols.put(col.getOrderNumberInSheet(), col.getPhase2ColumnName());
        }

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("SELECT%n"));

        fileAppender.println("Alter view [dbo].[RAAggregatedView] as");
        fileAppender.println("SELECT");
        fileAppender.println("asofdate_dif_ifre_assets,");
        sb.append(String.format("null,%n"));
        int count = 0;
        for (Phase2OutputColumnEntity column : colRA1) {
            int orderNumber = column.getOrderNumberInSheet();
            // at this column index, either RE or IFPI column is direct output
            if (column.getisDirectOutput() || iFPICols.containsKey(orderNumber)) {
                if(count > 0) {
                    fileAppender.println(",");
                    sb.append(String.format(",%n"));
                }

                if(column.getisDirectOutput())
                    fileAppender.print(column.getPhase2ColumnName());
                else  // column in RE section is not DirectOutput
                    fileAppender.print(String.format("null as %s", column.getPhase2ColumnName()));

                if (iFPICols.containsKey(orderNumber)) {
                    sb.append(iFPICols.get(orderNumber));
                    //this key has been read
                    iFPICols.put(orderNumber, null);
                } else
                    sb.append("null");

//                if (count != colRA1.size() - 1) {
//                    fileAppender.println(",");
//                    sb.append(String.format(",%n"));
//                } else {
//                    fileAppender.println("");
//                    sb.append(String.format("%n"));
//                }
            }
            count++;
        }

        for (Phase2OutputColumnEntity column : colRA2) {
            if(column.getisDirectOutput()){
                // this column has not been taken care by
                if(iFPICols.get(column.getOrderNumberInSheet())!=null){
                    fileAppender.println(",");
                    sb.append(String.format(",%n"));

                    String fakeColumnName = colRA1.get(column.getOrderNumberInSheet()).getPhase2ColumnName();
                    fileAppender.print("null as " + fakeColumnName);
                    sb.append(column.getPhase2ColumnName());
                }
            }
        }

        fileAppender.print(String.format("%n"));
        sb.append(String.format("%n"));

        fileAppender.println("from Enrichment_PhaseII where importid = (select max(importid) from dbo.IFRDH_Import where ImportType = 'REImport')");
        fileAppender.println("union all");
        fileAppender.print(sb.toString());
        fileAppender.println("from RAOutputView");
      //  fileAppender.println("order by investmentname");

        fileAppender.close();

    }
}
