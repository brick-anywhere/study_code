package com.dll.design.service.impl.factorypattern;

import com.dll.design.service.factorypattern.Shape;

/**
 *
 * Rectangle :  长方形
 *
 * @author dll
 * @date 2021-03-22 15:49
 *
 *
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method. 【长方形内部的方法】");
    }
}
