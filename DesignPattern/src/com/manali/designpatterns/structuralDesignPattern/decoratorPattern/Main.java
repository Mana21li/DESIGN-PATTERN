package com.manali.designpatterns.structuralDesignPattern.decoratorPattern;

import com.manali.designpatterns.structuralDesignPattern.decoratorPattern.decorators.decoratorImpl.GunPower;
import com.manali.designpatterns.structuralDesignPattern.decoratorPattern.decorators.decoratorImpl.HeightUpPower;
import com.manali.designpatterns.structuralDesignPattern.decoratorPattern.service.ICharacter;
import com.manali.designpatterns.structuralDesignPattern.decoratorPattern.service.impl.Mario;

public class Main {
    public static void main(String[] args) {
        ICharacter mario = new Mario();
        System.out.println("Basic Abilities: " + mario.getAbilities());

        mario = new HeightUpPower(new Mario());
        System.out.println("After Height up: " + mario.getAbilities());

        mario = new GunPower(new Mario());
        System.out.println("After Gun power: " + mario.getAbilities());

        //Add more
    }
}
