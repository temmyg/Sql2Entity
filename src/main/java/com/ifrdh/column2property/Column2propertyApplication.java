package com.ifrdh.column2property;


import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootApplication
public class Column2propertyApplication implements CommandLineRunner{

	@Autowired
	org.springframework.core.env.Environment env;

	@Autowired
	@Qualifier("deleteFileWriter")
	FileWriter deleteFileWriter;

	@Autowired
	@Qualifier("removeFileWriter")
	FileWriter removeTableFileWriter;

	ArrayList<String> content = new ArrayList<String>();

	final String newLine = System.getProperty("line.separator");
	String destFileName;
	FileOutputStream outputStream;

	String tableName;

	public static void main(String[] args) {
		SpringApplication.run(Column2propertyApplication.class, args);
	}

	public void run(String[] args) throws Exception{

		String srcFolder = env.getProperty("sourceFolder");
		File dir = new File(srcFolder);

		if(dir.isDirectory()){

			outputStream = new FileOutputStream(env.getProperty("combinedScriptFileName"));

			File[] files = dir.listFiles();
			for(File file : files){

				makeCodeFile(file.getPath());
				content.clear();

				removeTableScript();
				genDeleteScript();
				generateCombinedScript(file);

			}

			closeCombined();
			deleteFileWriter.close();
			removeTableFileWriter.close();
		}
	}

	public void readLines(String fileName) throws Exception{
		FileReader fr = null;
		BufferedReader br = null;
		// ArrayList<String> lines = new ArrayList<String>();

		content.add("package com.cppib.ifrdh.entity;");
		content.add("");
		content.add("import org.apache.camel.dataformat.bindy.annotation.CsvRecord;");
		content.add("import org.apache.camel.dataformat.bindy.annotation.DataField;");
		content.add("import javax.persistence.*;");
		content.add("");
		content.add("@CsvRecord(separator = \"\\\\|\", autospanLine = true)");
		content.add("@Entity");

		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String line = null;
			int propCount = 0;
			Pattern pattern;
			Matcher matcher;
			while((line = br.readLine())!=null){
				// table name searching
				if(line.indexOf("CREATE TABLE")!=-1){
					pattern = Pattern.compile("(?<=\\[dbo\\]\\.\\[)\\w+(?=\\])");
					matcher = pattern.matcher(line);
					matcher.find();
					String tableName = matcher.group();
					if(tableName!=null)
					{
						this.tableName = tableName;
						tableName = StringUtils.capitalize(tableName);
						content.add(String.format("@Table(name=\"%s\")", tableName));
						String className = tableName + "Entity";
						destFileName = className + ".java";
						content.add(String.format("public class %s %s", className, "{"));
						content.add("");
						content.add(tabs(1) + "int Id;");
						content.add("");
						content.add(tabs(1) + "@Id");
						content.add(tabs(1) + "@GeneratedValue(strategy= GenerationType.AUTO)");
						content.add(generateGetter("Id", "int", 1));
						content.add(generateSetter("Id", "int", 1));
						content.add("");
						continue;
					}
					else
						throw  new Exception("Table Name Not Found");

				}

				// column searching
				//pattern = Pattern.compile("(?<=\\t\\[)[a-zA-Z_0-9 ]+(?=\\]\\s)");
				pattern = Pattern.compile("(?<=\\t\\[)[a-zA-Z_0-9 ]+(?=\\]\\s)");
				matcher = pattern.matcher(line);
				if(matcher.find()) {
					propCount++;
					String prop = matcher.group();
					if(prop.indexOf(" ")!=-1)
						prop = prop.replace(' ','_');
					prop = Character.toLowerCase(prop.charAt(0)) + prop.substring(1);

					pattern = Pattern.compile("(?<=\\]\\s\\[)[a-zA-Z_0-9 ]+(?=\\])");
					matcher = pattern.matcher(line);
					if (matcher.find()) {
						String dataType = matcher.group();
						String javaDataType = findJavaDataType(dataType);

						if(javaDataType.indexOf("Date") != -1)
							content.add(2, "import java.util.Date;");
						content.add(String.format("\t@DataField(pos = %d)", propCount));
						content.add(String.format("\tprivate %s %s;", javaDataType, prop));
						content.add(generateGetter(prop, javaDataType, 1));
						content.add(generateSetter(prop, javaDataType, 1));
						content.add("");
					} else
						continue;

				}
			}
			content.add(String.format("} %n"));
		}
		catch (Exception e){

		}
		finally {
			fr.close();
			br.close();
		}
	}

	public void writeContent() throws Exception {

		String destFolder = env.getProperty("destFolder");

		if(!new File(destFolder).exists())
			throw new FileNotFoundException();

		String dFileName = env.getProperty("destFile");
		String destFile = dFileName == null ? "sourceProperty" : dFileName;

		destFile = destFolder + "\\" + (destFileName == null ? destFile : destFileName);

		FileWriter fw = new FileWriter(destFile);

		for (String line : content) {
				fw.append(line);
				fw.append(newLine);
		}

		fw.close();
	}

	private String generateGetter(String propertyName, String type, int initialTabNum) {
		StringBuilder sb = new StringBuilder();

		sb.append(tabs(initialTabNum));
		sb.append("public " + type + " get" + StringUtils.capitalize(propertyName));
		sb.append("() {");
		sb.append(newLine);
		sb.append(tabs(initialTabNum+1));
		sb.append("return " + propertyName + ";");
		sb.append(newLine);
		sb.append(tabs(initialTabNum));
		sb.append("}");
		return sb.toString();
	}

	private String generateSetter(String propertyName, String type, int initialTabNum) {
		StringBuilder sb = new StringBuilder();

		sb.append(tabs(initialTabNum));
		sb.append("public void " + "set" + StringUtils.capitalize(propertyName));
		sb.append("(" + type + " " + propertyName + ") {");
		sb.append(newLine);
		sb.append(tabs(initialTabNum + 1));
		sb.append("this." + propertyName + " = " + propertyName + ";");
		sb.append(newLine);
		sb.append(tabs(initialTabNum));
		sb.append("}");
		return sb.toString();
	}

	private void generateCombinedScript(File file) throws Exception {

		byte[] buf = new byte[1024];
		FileInputStream inputStream = new FileInputStream(file);
		int count = 0;
		while ((count = inputStream.read(buf))>=0){
			outputStream.write(buf, 0, count);
			outputStream.flush();
		}

		StringBuilder sb = new StringBuilder();
		String addId = String.format("%n alter table %s add Id bigint identity (1, 1) %n", tableName);
		String addPrimaryKey = String.format("%n alter table %s add primary key (Id) %n", tableName);
		outputStream.write(addId.getBytes());
		outputStream.write(addPrimaryKey.getBytes());
		outputStream.flush();
		inputStream.close();
	}

	private void closeCombined() throws Exception{
		outputStream.close();
	}

	private String findJavaDataType(String sqlDataType){
		String resultType = null;
		switch (sqlDataType) {
			case "float":
				resultType = "Double";
				break;
			case "datetime":
				resultType = "Date";
				break;
			case "varchar":
			case "nvarchar":
				resultType = "String";
				break;
			default:
				resultType = "String";
		}
		return resultType;
	}

	private void genDeleteScript() throws Exception{
		deleteFileWriter.append(String.format("truncate table %s %n", tableName));
	}

	private void removeTableScript() throws Exception{
		removeTableFileWriter.append(String.format("drop table %s %n", tableName));
	}

	public void makeCodeFile(String fileName) throws Exception{
		readLines(fileName);
		writeContent();
	}


	private String tabs(int num) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<num; i++)
			sb.append("\t");
		return sb.toString();
	}
}
