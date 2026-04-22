package com.manali.designpatterns.behaviouralDesignPattern.commandPattern.command.commandImpl;

import com.manali.designpatterns.behaviouralDesignPattern.commandPattern.command.Command;
import com.manali.designpatterns.behaviouralDesignPattern.commandPattern.receivers.Light;

public class LightCommand implements Command {
    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
