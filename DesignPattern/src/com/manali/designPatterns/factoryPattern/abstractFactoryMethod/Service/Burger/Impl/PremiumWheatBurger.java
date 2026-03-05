package com.manali.designPatterns.factoryPattern.abstractFactoryMethod.Service.Burger.Impl;

import com.manali.designPatterns.factoryPattern.abstractFactoryMethod.Service.Burger.Burger;

public class PremiumWheatBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Premium Wheat Burger");
    }
}
