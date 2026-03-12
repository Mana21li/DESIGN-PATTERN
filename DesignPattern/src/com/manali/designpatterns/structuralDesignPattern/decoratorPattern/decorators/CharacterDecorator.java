package com.manali.designpatterns.structuralDesignPattern.decoratorPattern.decorators;

import com.manali.designpatterns.structuralDesignPattern.decoratorPattern.service.ICharacter;

public abstract class CharacterDecorator implements ICharacter {
    protected ICharacter character;

    public CharacterDecorator(ICharacter character) {
        this.character = character;
    }
}
