package com.dll.design.demo.abstractfactory;

import com.dll.design.service.factorypattern.Color;
import com.dll.design.service.factorypattern.Shape;
import com.dll.design.service.impl.factorypattern.Blue;
import com.dll.design.service.impl.factorypattern.Green;
import com.dll.design.service.impl.factorypattern.Red;

/**
 * @author dll
 * @date 2021-03-22 16:58
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
