package com.dll.design.demo.bridgepattern;

/**
 * 使用 DrawAPI 接口创建抽象类 Shape。
 * @author dll
 * @date 2021-05-19 11:02
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
