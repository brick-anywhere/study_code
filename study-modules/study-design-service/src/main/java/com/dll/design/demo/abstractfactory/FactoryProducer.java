package com.dll.design.demo.abstractfactory;

/**
 * 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 * @author dll
 * @date 2021-03-22 17:00
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
