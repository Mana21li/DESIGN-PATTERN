package com.manali.designPatterns.creationalDesignPattern.factoryPattern.factoryMethod.Service.impl;

import com.manali.designPatterns.creationalDesignPattern.factoryPattern.factoryMethod.Service.Burger;

public class PremiumBurger implements Burger {
    public void prepareBurger() {
        System.out.println("Premium Burger");
    }
}
