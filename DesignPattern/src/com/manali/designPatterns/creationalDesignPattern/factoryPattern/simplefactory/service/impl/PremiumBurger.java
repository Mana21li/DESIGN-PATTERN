package com.manali.designPatterns.creationalDesignPattern.factoryPattern.simplefactory.service.impl;

import com.manali.designPatterns.creationalDesignPattern.factoryPattern.simplefactory.service.Burger;

public class PremiumBurger implements Burger {
    @Override
    public void prepareBurger() {
        System.out.println("Premium Burger");
    }
}
