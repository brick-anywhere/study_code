package com.dll.design.demo.builderpattern;

/**
 * @author dll
 * @date 2021-03-29 16:12
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
