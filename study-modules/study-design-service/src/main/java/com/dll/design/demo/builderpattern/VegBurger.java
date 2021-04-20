package com.dll.design.demo.builderpattern;

/**
 * @author dll
 * @date 2021-03-29 16:10
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
