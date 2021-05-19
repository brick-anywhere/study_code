package com.dll.design.demo.bridgepattern;

/**
 * 创建实现了 Shape 抽象类的实体类。
 * @author dll
 * @date 2021-05-19 11:03
 */
public class Circle extends Shape{
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
