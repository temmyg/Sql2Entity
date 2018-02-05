package com.ifrdh.column2property.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
@Scope("prototype")
public class SizedBuffer {
    int capacity = 100;
    private byte[] buf = new byte[capacity];
    int filledLen;

    public SizedBuffer(@Value("100") int capacity){
        this.capacity = capacity;
    }

    public boolean canWrite(String content){
        return capacity - filledLen >= content.length();
    }

    public void write(String content) {
        byte[] input = content.getBytes();
        try {
            for (int i = 0; i < input.length; i++) {
                buf[filledLen + i] = input[i];
            }
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }

        filledLen += input.length;
    }

    public void clear() {
        filledLen = 0;
    }

    public byte[] getBuf() {
       return Arrays.copyOfRange(buf, 0, filledLen);
    }
}
