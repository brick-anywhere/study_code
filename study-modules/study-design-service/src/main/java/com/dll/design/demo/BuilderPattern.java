package com.dll.design.demo;

import com.dll.design.demo.builderpattern.Meal;
import com.dll.design.demo.builderpattern.MealBuilder;
import com.dll.design.service.WaiterService;
import com.dll.design.service.impl.ManWaiterServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

/**
 * 建造者  模式
 * @author dll
 * @date 2021-03-29 16:00
 */
public class BuilderPattern {
    @Test
    public void fun1() {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
