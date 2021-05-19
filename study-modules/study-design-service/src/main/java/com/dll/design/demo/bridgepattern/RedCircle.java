package com.dll.design.demo.bridgepattern;

/**
 * 创建实现了 DrawAPI 接口的实体桥接实现类。
 * @author dll
 * @date 2021-05-19 11:00
 */
public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
