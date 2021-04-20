package com.dll.design.demo.builderpattern;

/**
 * @author dll
 * @date 2021-03-29 16:08
 */
public abstract  class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
