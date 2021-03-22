package com.dll.design.demo.abstractfactory;

import com.dll.design.service.factorypattern.Color;
import com.dll.design.service.factorypattern.Shape;
import com.dll.design.service.impl.factorypattern.Circle;
import com.dll.design.service.impl.factorypattern.Rectangle;
import com.dll.design.service.impl.factorypattern.Square;

/**
 * @author dll
 * @date 2021-03-22 16:56
 */
public class ShapeFactory  extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
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
