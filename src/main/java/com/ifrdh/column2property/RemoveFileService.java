package com.ifrdh.column2property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.FileWriter;

@Component
public class RemoveFileService {
    static FileWriter fw;

    @Autowired
    Environment env;

    @Bean(name="removeFileWriter")
    public FileWriter fileWriter() throws Exception{
        if(fw == null)
            fw = new FileWriter(env.getProperty("dropTableScript"));

        return fw;
    }
}
