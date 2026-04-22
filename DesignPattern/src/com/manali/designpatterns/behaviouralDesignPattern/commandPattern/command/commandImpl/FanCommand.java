package com.manali.designpatterns.behaviouralDesignPattern.commandPattern.command.commandImpl;

import com.manali.designpatterns.behaviouralDesignPattern.commandPattern.command.Command;
import com.manali.designpatterns.behaviouralDesignPattern.commandPattern.receivers.Fan;
import com.manali.designpatterns.behaviouralDesignPattern.commandPattern.receivers.Light;

public class FanCommand implements Command {
    private Fan fan;

    public FanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }

    @Override
    public void undo() {
        fan.off();
    }
}
