package com.dll.design.demo.prototypepattern;

/**
 * @author dll
 * @date 2021-05-17 14:06
 */
public class Square extends Shape{
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
