package com.dll.design.demo.facadepattern;

/**
 * @author dll
 * @date 2021-05-20 14:08
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
