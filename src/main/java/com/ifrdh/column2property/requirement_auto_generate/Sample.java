package com.ifrdh.column2property.requirement_auto_generate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Sample {

    public static String name;

    @PostConstruct
    public void init(){
        name = privateName;
    }

    @Value("${destFolder}")
    private String privateName;

    public String getPrivateName() {
        return privateName;
    }

    public void setPrivateName(String privateName) {
        this.privateName = privateName;
    }

}