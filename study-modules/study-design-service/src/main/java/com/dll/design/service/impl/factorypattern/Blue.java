package com.dll.design.service.impl.factorypattern;

import com.dll.design.service.factorypattern.Color;

/**
 * @author dll
 * @date 2021-03-22 16:54
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method. 【蓝色内部的方法】");
    }
}
