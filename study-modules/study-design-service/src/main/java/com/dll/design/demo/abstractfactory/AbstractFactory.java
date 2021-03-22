package com.dll.design.demo.abstractfactory;

import com.dll.design.service.factorypattern.Color;
import com.dll.design.service.factorypattern.Shape;

/**
 * 为 Color 和 Shape 对象创建抽象类来获取工厂。
 *
 * @author dll
 * @date 2021-03-22 16:55
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
