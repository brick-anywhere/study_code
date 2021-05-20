package com.dll.design.demo.facadepattern;

/**
 * @author dll
 * @date 2021-05-20 14:07
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
