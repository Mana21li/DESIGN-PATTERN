package com.manali.designPatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.GarlicBread.impl;

import com.manali.designPatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.GarlicBread.GarlicBread;

public class BasicGarlicBread implements GarlicBread {
    @Override
    public void prepare() {
        System.out.println("Basic Garlic Bread");
    }
}
