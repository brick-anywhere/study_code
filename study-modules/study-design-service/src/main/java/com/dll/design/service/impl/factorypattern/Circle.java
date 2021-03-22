package com.dll.design.service.impl.factorypattern;

import com.dll.design.service.factorypattern.Shape;

/**
 * Circle：圆形
 * @author dll
 * @date 2021-03-22 15:53
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method. 【圆形内部的方法】");
    }
}
