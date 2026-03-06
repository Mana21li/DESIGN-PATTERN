package com.manali.designPatterns.creationalDesignPattern.factoryPattern.factoryMethod.Service.impl;

import com.manali.designPatterns.creationalDesignPattern.factoryPattern.factoryMethod.Service.Burger;

public class StandardWheatBurger implements Burger {
    @Override
    public void prepareBurger() {
        System.out.println("Standard Wheat Burger");
    }
}
