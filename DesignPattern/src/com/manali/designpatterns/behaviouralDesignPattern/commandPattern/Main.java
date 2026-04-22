package com.manali.designpatterns.behaviouralDesignPattern.commandPattern;

import com.manali.designpatterns.behaviouralDesignPattern.commandPattern.command.commandImpl.FanCommand;
import com.manali.designpatterns.behaviouralDesignPattern.commandPattern.command.commandImpl.LightCommand;
import com.manali.designpatterns.behaviouralDesignPattern.commandPattern.receivers.Fan;
import com.manali.designpatterns.behaviouralDesignPattern.commandPattern.receivers.Light;
import com.manali.designpatterns.behaviouralDesignPattern.commandPattern.senders.RemoteController;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();

        RemoteController remote = new RemoteController();

        remote.setCommand(0, new LightCommand(livingRoomLight));
        remote.setCommand(1, new FanCommand(ceilingFan));

        System.out.println("-------Toggling Light Button 0--------");
        remote.pressButton(0);
        remote.pressButton(0);

        System.out.println("-------Toggling Fan Button 1--------");
        remote.pressButton(1);
        remote.pressButton(1);

        System.out.println("-------Toggling Unassigned Button 2--------");
        remote.pressButton(2);
    }
}
