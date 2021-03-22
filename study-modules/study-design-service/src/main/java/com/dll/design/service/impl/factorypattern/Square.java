package com.dll.design.service.impl.factorypattern;

import com.dll.design.service.factorypattern.Shape;

/**
 * Square :  正方形
 * @author dll
 * @date 2021-03-22 15:52
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method. 【正方形内部的方法】");
    }
}
