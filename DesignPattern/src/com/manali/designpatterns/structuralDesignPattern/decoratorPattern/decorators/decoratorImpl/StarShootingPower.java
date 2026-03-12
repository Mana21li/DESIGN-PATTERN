package com.manali.designpatterns.structuralDesignPattern.decoratorPattern.decorators.decoratorImpl;

import com.manali.designpatterns.structuralDesignPattern.decoratorPattern.decorators.CharacterDecorator;
import com.manali.designpatterns.structuralDesignPattern.decoratorPattern.service.ICharacter;

public class StarShootingPower extends CharacterDecorator {
    public StarShootingPower(ICharacter character) {
        super(character);
    }

    @Override
    public String getAbilities() {
        return character.getAbilities() + "with star shooting power";
    }
}
