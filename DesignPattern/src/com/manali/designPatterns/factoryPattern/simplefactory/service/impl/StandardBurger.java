package com.manali.designPatterns.factoryPattern.simplefactory.service.impl;

import com.manali.designPatterns.factoryPattern.simplefactory.service.Burger;

public class StandardBurger implements Burger {
    @Override
    public void prepareBurger() {
        System.out.println("Standard Burger");
    }
}
