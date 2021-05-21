package com.dll.design.demo.chainofresponsibilitypattern;

/**
 * @author dll
 * @date 2021-05-21 10:21
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
