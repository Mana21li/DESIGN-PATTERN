package com.manali.designPatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.GarlicBread.impl;

import com.manali.designPatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.GarlicBread.GarlicBread;

public class BasicWheatGarlicBread implements GarlicBread {
    @Override
    public void prepare() {
        System.out.println("Basic Wheat Garlic Bread");
    }
}
