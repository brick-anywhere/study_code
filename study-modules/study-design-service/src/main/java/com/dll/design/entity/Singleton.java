package com.dll.design.entity;

/**
 * @author dll
 * @date 2021-03-23 15:37
 */
public class Singleton {
    private static Singleton instance;
    private Singleton (){}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
