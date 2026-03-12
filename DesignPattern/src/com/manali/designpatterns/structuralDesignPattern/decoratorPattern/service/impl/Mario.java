package com.manali.designpatterns.structuralDesignPattern.decoratorPattern.service.impl;

import com.manali.designpatterns.structuralDesignPattern.decoratorPattern.service.ICharacter;

public class Mario implements ICharacter {
    @Override
    public String getAbilities() {
        return "Mario Running";
    }
}
