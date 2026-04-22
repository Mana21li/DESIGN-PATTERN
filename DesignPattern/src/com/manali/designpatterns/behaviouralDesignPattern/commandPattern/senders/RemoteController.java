package com.manali.designpatterns.behaviouralDesignPattern.commandPattern.senders;

import com.manali.designpatterns.behaviouralDesignPattern.commandPattern.command.Command;

public class RemoteController {

    private static final int numOfButtons = 4;
    private Command[] buttons;
    private boolean[] buttonState;

    public RemoteController() {
        buttons = new Command[numOfButtons];
        buttonState = new boolean[numOfButtons];
        for (int i = 0; i < numOfButtons; i++) {
            buttons[i] = null;
            buttonState[i] = false;
        }
    }

    public void setCommand(int index, Command command) {
        if (index >= 0 && index < numOfButtons) {
            buttons[index] = command;
            buttonState[index] = false;
        }
    }

    public void pressButton(int buttonIndex) {
       if (buttonIndex >= 0 && buttonIndex < numOfButtons && buttons[buttonIndex] != null) {
           if (!buttonState[buttonIndex]) {
               buttons[buttonIndex].execute();
           } else {
               buttons[buttonIndex].undo();
           }
           buttonState[buttonIndex] = !buttonState[buttonIndex];
       } else  {
           System.out.println("No command assigned at button: " + buttonIndex);
       }
    }
}
