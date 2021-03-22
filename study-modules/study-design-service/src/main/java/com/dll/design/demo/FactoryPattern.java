package com.dll.design.demo;

import com.dll.design.service.factorypattern.Shape;
import com.dll.design.service.impl.factorypattern.ShapeFactory;

/**
 * 工厂模式
 *
 * @author dll
 * @date 2021-03-22 15:47
 */
public class FactoryPattern {
    public static void main(String[] args) {
        //使用该工厂，通过传递类型信息来获取实体类的对象。
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();
    }
}
