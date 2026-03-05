package com.manali.designPatterns.factoryPattern.factoryMethod.factory;

import com.manali.designPatterns.factoryPattern.factoryMethod.Service.Burger;

public interface BurgerFactory {
    Burger createBurger(String type);
}
