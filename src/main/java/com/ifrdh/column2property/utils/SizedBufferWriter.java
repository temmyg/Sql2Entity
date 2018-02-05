package com.ifrdh.column2property.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class SizedBufferWriter {

    @Autowired
    private SizedBuffer buffer;

    private FileOutputStream outputStream;

    final private String newLine = System.getProperty("line.separator");

    @Autowired
    public SizedBufferWriter(String fileName) throws Exception{
        outputStream = new FileOutputStream(fileName);
    }

    public SizedBufferWriter(File file) throws Exception {
        this(file.getName());
    }

    public void write(String content) throws Exception {

        if(content.length() > buffer.capacity)
            throw new Exception("exceeds buffer capacity");

        if(!buffer.canWrite(content)){
            outputStream.write(buffer.getBuf());
            outputStream.write(newLine.getBytes());
            outputStream.flush();
            buffer.clear();
        }

        buffer.write(content);
    }

    public void close() throws Exception{
        if(buffer.filledLen > 0) {
            outputStream.write(buffer.getBuf());
            outputStream.flush();
        }
        outputStream.close();
    }
}
