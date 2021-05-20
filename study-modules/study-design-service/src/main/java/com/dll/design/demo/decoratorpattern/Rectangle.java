package com.dll.design.demo.decoratorpattern;

/**
 * @author dll
 * @date 2021-05-20 13:45
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
