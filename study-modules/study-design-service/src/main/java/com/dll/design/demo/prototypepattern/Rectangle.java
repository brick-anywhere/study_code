package com.dll.design.demo.prototypepattern;

/**
 * @author dll
 * @date 2021-05-17 14:05
 */
public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
