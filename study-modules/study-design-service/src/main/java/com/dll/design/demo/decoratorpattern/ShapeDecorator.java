package com.dll.design.demo.decoratorpattern;

/**
 * @author dll
 * @date 2021-05-20 13:46
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
