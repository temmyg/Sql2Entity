package com.ifrdh.column2property.requirement_auto_generate;

import com.ifrdh.column2property.utils.CodeHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class IFREStagingEntitiesGenerator {

    private static String destFileName = null;
    private static String folderName;
    private static String lineSeprator = System.getProperty("line.separator");

    private static ArrayList<String> fileContent = new ArrayList<>();

    private final static CodeHelper codeHelper = new CodeHelper();

    private static FileWriter fWriter;

    @Value("${destFolder}")
    public void setDestFolder(String folder) throws Exception{
        folderName = folder;
//        try{
//            throw new Exception("aa");
//        }
//        catch (Exception e) {
//                System.out.println(String.format("the stack: "));
//                e.printStackTrace();
//                int i = 2;
//        }
    };

    public static void createStagingEntitiesFromScript(String filename) throws Exception {
        FileReader fReader = new FileReader(filename);
        BufferedReader fileReader = new BufferedReader(fReader);
        String line = null;
        String tableName = null;
        Pattern pattern;
        Matcher matcher;
        int propCount = 0;
        while ((line = fileReader.readLine()) != null) {
            try {

                if (line.indexOf("CREATE TABLE") != -1) {
                    pattern = Pattern.compile("(?<=CREATE\\sTABLE\\s{1,20}+)\\w+(?=\\s+\\()");
                    matcher = pattern.matcher(line);
                    matcher.find();
                    tableName = matcher.group();
                    if (tableName != null) {
                        //write last group to file and reset
                        if (fileContent.size() != 0 && destFileName != null) {
                            fileContent.add(String.format("} %n"));
                            writeToFile();
                            propCount = 0;
                            fileContent.clear();
                        }

                        outputImportStatements();

                        tableName = StringUtils.capitalize(tableName);
                        fileContent.add(String.format("@Table(name=\"%s\")", tableName));
                        String className = tableName + "Entity";
                        destFileName = className + ".java";

                        openFile();

                        fileContent.add(String.format("public class %s %s", className, "{"));
                        fileContent.add("");
                        fileContent.add(codeHelper.tabs(1) + "int Id;");
                        fileContent.add("");
                        fileContent.add(codeHelper.tabs(1) + "@Id");
                        fileContent.add(codeHelper.tabs(1) + "@GeneratedValue(strategy= GenerationType.AUTO)");
                        fileContent.add(codeHelper.generateGetter("Id", "int", 1));
                        fileContent.add(codeHelper.generateSetter("Id", "int", 1));
                        fileContent.add("");
                        continue;
                    } else
                        throw new Exception("Table Name Not Found");
                } else {
                    // column searching
                    //pattern = Pattern.compile("(?<=\\t\\[)[a-zA-Z_0-9 ]+(?=\\]\\s)");

                    // match column name
                    pattern = Pattern.compile("(?<=\\t)\\w+(?=\\s{1,10}.{1,30},)");
                    matcher = pattern.matcher(line);
                    if (matcher.find()) {
                        String prop = matcher.group();
                        if (!prop.toLowerCase().equals("id")) {
                            if (prop.indexOf(" ") != -1)
                                prop = prop.replace(' ', '_');
                            prop = Character.toLowerCase(prop.charAt(0)) + prop.substring(1);

                            //match datafield
                            pattern = Pattern.compile("(?<=--\\s{1,20}dataField:\\s{1,20})\\w+\\b");
                            matcher = pattern.matcher(line);

                            if (matcher.find())
                                fileContent.add(String.format("\t@DataField(pos = %s)", matcher.group()));
                            else
                                throw new Exception(String.format("no DataField found in table %S column %S", tableName, prop));

                            // match column sql type
                            pattern = Pattern.compile("(?<=\\t\\w{1,50}\\s{1,20})\\w+(?=.{1,30},)");
                            matcher = pattern.matcher(line);
                            if (matcher.find()) {
                                String dataType = matcher.group();
                                String javaDataType = codeHelper.findJavaDataType(dataType);

                                if (javaDataType.indexOf("Date") != -1 && fileContent.get(2).indexOf("Date") == -1)
                                    fileContent.add(2, "import java.util.Date;");

                                fileContent.add(String.format("\tprivate %s %s;", javaDataType, prop));
                                fileContent.add(codeHelper.generateGetter(prop, javaDataType, 1));
                                fileContent.add(codeHelper.generateSetter(prop, javaDataType, 1));
                            }
                            fileContent.add("");
                        } else
                            continue;
                    }
                }
            }
            catch (Exception e){
                int i = 0;
            }
        }
        fileContent.add(String.format("} %n"));
        writeToFile();
    }

    private static void outputImportStatements() {
        fileContent.add("package com.cppib.ifrdh.entity;");
        fileContent.add("");
        fileContent.add("import org.apache.camel.dataformat.bindy.annotation.CsvRecord;");
        fileContent.add("import org.apache.camel.dataformat.bindy.annotation.DataField;");
        fileContent.add("import javax.persistence.*;");
        fileContent.add("");
        fileContent.add("@CsvRecord(separator = \"\\\\|\", autospanLine = true)");
        fileContent.add("@Entity");
    }

    private static void openFile() throws Exception {
        fWriter = new FileWriter(folderName + "\\" + destFileName);
    }

    private static void writeToFile() throws Exception {
        for (String line : fileContent) {
            if (line.endsWith(lineSeprator))
                fWriter.append(line);
            else
                fWriter.append(line + lineSeprator);
        }
        fWriter.close();
    }
}
