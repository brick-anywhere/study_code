package com.dll.design.demo.builderpattern;

/**
 * @author dll
 * @date 2021-03-29 16:10
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
