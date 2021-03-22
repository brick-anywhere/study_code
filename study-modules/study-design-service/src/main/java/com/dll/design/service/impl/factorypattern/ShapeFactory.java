package com.dll.design.service.impl.factorypattern;

import com.dll.design.service.factorypattern.Shape;
import com.dll.design.service.impl.factorypattern.Circle;
import com.dll.design.service.impl.factorypattern.Rectangle;
import com.dll.design.service.impl.factorypattern.Square;

/**
 * 创建一个工厂，生成基于给定信息的实体类的对象
 * @author dll
 * @date 2021-03-22 15:55
 */
public class ShapeFactory {
    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
