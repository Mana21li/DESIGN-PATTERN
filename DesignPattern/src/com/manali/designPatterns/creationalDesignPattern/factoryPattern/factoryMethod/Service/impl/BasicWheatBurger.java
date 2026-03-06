package com.manali.designPatterns.creationalDesignPattern.factoryPattern.factoryMethod.Service.impl;

import com.manali.designPatterns.creationalDesignPattern.factoryPattern.factoryMethod.Service.Burger;

public class BasicWheatBurger implements Burger {
    @Override
    public void prepareBurger() {
        System.out.println("Basic wheat Burger");
    }
}
