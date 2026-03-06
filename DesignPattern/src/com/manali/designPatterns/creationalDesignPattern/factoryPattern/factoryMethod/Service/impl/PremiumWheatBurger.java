package com.manali.designPatterns.creationalDesignPattern.factoryPattern.factoryMethod.Service.impl;

import com.manali.designPatterns.creationalDesignPattern.factoryPattern.factoryMethod.Service.Burger;

public class PremiumWheatBurger implements Burger {
    @Override
    public void prepareBurger() {
        System.out.println("Premium Wheat Burger");
    }
}
