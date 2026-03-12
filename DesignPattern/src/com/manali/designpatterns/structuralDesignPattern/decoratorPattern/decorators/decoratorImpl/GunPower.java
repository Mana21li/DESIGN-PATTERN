package com.manali.designpatterns.structuralDesignPattern.decoratorPattern.decorators.decoratorImpl;

import com.manali.designpatterns.structuralDesignPattern.decoratorPattern.decorators.CharacterDecorator;
import com.manali.designpatterns.structuralDesignPattern.decoratorPattern.service.ICharacter;

public class GunPower extends CharacterDecorator {
    public GunPower(ICharacter character) {
        super(character);
    }

    @Override
    public String getAbilities() {
        return character.getAbilities() + "with gun power";
    }
}
