package com.dll.design.service.impl.factorypattern;

import com.dll.design.service.factorypattern.Color;

/**
 * @author dll
 * @date 2021-03-22 16:53
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method. 【绿色内部的方法】");
    }
}
