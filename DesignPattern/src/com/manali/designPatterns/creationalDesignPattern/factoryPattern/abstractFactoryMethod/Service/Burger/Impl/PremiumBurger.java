package com.manali.designPatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.Burger.Impl;

import com.manali.designPatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.Burger.Burger;

public class PremiumBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Premium Burger");
    }
}
