package com.dll.design.demo.builderpattern;

/**
 * @author dll
 * @date 2021-03-29 16:11
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
