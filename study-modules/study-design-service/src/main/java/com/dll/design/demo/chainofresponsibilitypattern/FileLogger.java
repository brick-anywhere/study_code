package com.dll.design.demo.chainofresponsibilitypattern;

/**
 * @author dll
 * @date 2021-05-21 10:23
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
