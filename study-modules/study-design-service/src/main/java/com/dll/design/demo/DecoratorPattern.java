package com.dll.design.demo;


import com.dll.design.demo.decoratorpattern.*;
import org.junit.jupiter.api.Test;

/**
 * @author dll
 * @date 2021-05-20 13:49
 */
public class DecoratorPattern {
    @Test
    public void fun1() {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        //Shape redCircle = new RedShapeDecorator(new Circle());
        //Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }

}
