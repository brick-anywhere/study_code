package com.dll.design.demo.prototypepattern;

/**
 * @author dll
 * @date 2021-05-17 14:06
 */
public class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
