package com.dll.design.demo.facadepattern;

/**
 * @author dll
 * @date 2021-05-20 14:06
 */
public class Rectangle  implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
