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

    @Bean(name="ImportingTableNames")
    public String[] tableNames(){
        return new String[] {
                "DIF_IFRE_DF2",
                "DIF_IFRE_Assets",
                "DIF_ASCAP19",  "DIF_ASCAP18", "DIF_IFRE_Total", "DIF_IFRE_Ownership",
                "DIF_IFRE_AssetPredMaturityDate", "DIF_IFRE_AssetDebtMaturityDate", "DIF_IFRE_AssetValuationEffDate",
                "DIF_IFRE_FX", "DIF_IFRE_INVEQUIT_A",
                "DIF_IFRE_INVEQUIT",
                "DIF_IFRE_ALPHOL",
                "DIF_IFRE_DF3"
        };
    }
}
