package com.dll.design.service.impl.factorypattern;

import com.dll.design.service.factorypattern.Color;

/**
 * @author dll
 * @date 2021-03-22 16:52
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method. 【红色内部的方法】");
    }
}
