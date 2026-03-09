package com.manali.designpatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.factory.factoryImpl;

import com.manali.designpatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.Burger.Burger;
import com.manali.designpatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.Burger.Impl.*;
import com.manali.designpatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.GarlicBread.GarlicBread;
import com.manali.designpatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.GarlicBread.impl.*;
import com.manali.designpatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.factory.MealFactory;

public class KingFactory implements MealFactory {

    @Override
    public Burger createBurger(String type) {
        if("basic".equalsIgnoreCase(type)){
            return new BasicWheatBurger();
        } else if("standard".equalsIgnoreCase(type)){
            return new StandardWheatBurger();
        } else if ("premium".equalsIgnoreCase(type)) {
            return new PremiumWheatBurger();
        } else {
            System.out.println("No Wheat burger found");
            return null;
        }
    }

    @Override
    public GarlicBread createGarlicBread(String type) {
        if("basic".equalsIgnoreCase(type)){
            return new BasicWheatGarlicBread();
        } else if("cheese".equalsIgnoreCase(type)){
            return new CheeseWheatGarlicBread();
        }  else {
            System.out.println("No wheat Garlic bread found");
            return null;
        }
    }
}
