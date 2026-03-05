package com.manali.designPatterns.factoryPattern.abstractFactoryMethod.Service.Burger.Impl;

import com.manali.designPatterns.factoryPattern.abstractFactoryMethod.Service.Burger.Burger;

public class StandardWheatBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Standard Wheat Burger");
    }
}
