package com.manali.designpatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.factory.factoryImpl;

import com.manali.designpatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.Burger.Burger;
import com.manali.designpatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.Burger.Impl.*;
import com.manali.designpatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.GarlicBread.GarlicBread;
import com.manali.designpatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.GarlicBread.impl.*;
import com.manali.designpatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.factory.MealFactory;

public class SinghFactory implements MealFactory {

    @Override
    public Burger createBurger(String type) {
        if("basic".equalsIgnoreCase(type)){
            return new BasicBurger();
        } else if("standard".equalsIgnoreCase(type)){
            return new StandardBurger();
        } else if ("premium".equalsIgnoreCase(type)) {
            return new PremiumBurger();
        } else {
            System.out.println("No burger found");
            return null;
        }
    }

    @Override
    public GarlicBread createGarlicBread(String type) {
        if("basic".equalsIgnoreCase(type)){
            return new BasicGarlicBread();
        } else if("cheese".equalsIgnoreCase(type)){
            return new CheeseGarlicBread();
        }  else {
            System.out.println("No Garlic bread found");
            return null;
        }
    }
}
