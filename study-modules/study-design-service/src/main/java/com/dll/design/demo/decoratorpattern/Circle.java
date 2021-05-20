package com.dll.design.demo.decoratorpattern;

/**
 * @author dll
 * @date 2021-05-20 13:46
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
