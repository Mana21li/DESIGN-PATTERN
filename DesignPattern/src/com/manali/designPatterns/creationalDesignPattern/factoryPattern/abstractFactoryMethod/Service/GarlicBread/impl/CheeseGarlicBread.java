package com.manali.designPatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.GarlicBread.impl;

import com.manali.designPatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.GarlicBread.GarlicBread;

public class CheeseGarlicBread implements GarlicBread {
    @Override
    public void prepare() {
        System.out.println("Cheese Garlic Bread");
    }
}
