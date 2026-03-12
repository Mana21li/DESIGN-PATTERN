package com.manali.designpatterns.structuralDesignPattern.decoratorPattern.decorators.decoratorImpl;

import com.manali.designpatterns.structuralDesignPattern.decoratorPattern.decorators.CharacterDecorator;
import com.manali.designpatterns.structuralDesignPattern.decoratorPattern.service.ICharacter;

public class HeightUpPower extends CharacterDecorator {
    public HeightUpPower(ICharacter character) {
        super(character);
    }
    @Override
    public String getAbilities() {
        return character.getAbilities() + "with height up";
    }
}
