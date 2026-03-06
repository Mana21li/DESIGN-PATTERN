package com.manali.designPatterns.creationalDesignPattern.factoryPattern.factoryMethod.factory.factoryImpl;


import com.manali.designPatterns.creationalDesignPattern.factoryPattern.factoryMethod.Service.Burger;
import com.manali.designPatterns.creationalDesignPattern.factoryPattern.factoryMethod.Service.impl.BasicBurger;
import com.manali.designPatterns.creationalDesignPattern.factoryPattern.factoryMethod.Service.impl.PremiumBurger;
import com.manali.designPatterns.creationalDesignPattern.factoryPattern.factoryMethod.Service.impl.StandardBurger;
import com.manali.designPatterns.creationalDesignPattern.factoryPattern.factoryMethod.factory.BurgerFactory;

public class SinghBurger implements BurgerFactory {
    @Override
    public Burger createBurger(String type) {
        if("basic".equalsIgnoreCase(type)){
            return new BasicBurger();
        } else if("standard".equalsIgnoreCase(type)){
            return new StandardBurger();
        } else if("premium".equalsIgnoreCase(type)){
            return new PremiumBurger();
        } else {
            System.out.println("Burger not found");
            return null;
        }
    }
}
