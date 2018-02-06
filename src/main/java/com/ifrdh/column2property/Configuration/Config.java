package com.ifrdh.column2property.Configuration;

import com.ifrdh.column2property.utils.SizedBuffer;
import com.ifrdh.column2property.utils.SizedBufferWriter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name = "normSizedWriter")
    public SizedBufferWriter getNormWriter(@Value("${normalizationScriptFile}")String fileName) throws Exception{
        return new SizedBufferWriter(fileName);
    }

    @Bean(name = "enrichSizedWriter")
    public SizedBufferWriter getEnrichWriter(@Value("${enrichmentScriptFile}")String fileName) throws Exception {
        return new SizedBufferWriter(fileName);
    }
}
