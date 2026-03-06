package com.manali.designPatterns.creationalDesignPattern.factoryPattern.factoryMethod.factory;

import com.manali.designPatterns.creationalDesignPattern.factoryPattern.factoryMethod.Service.Burger;

public interface BurgerFactory {
    Burger createBurger(String type);
}
