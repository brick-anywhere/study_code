package com.dll.design.demo.builderpattern;

/**
 * @author dll
 * @date 2021-03-29 16:09
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
