package com.pgs.javadev.ui;

import com.pgs.javadev.common.IOHandler;
import com.pgs.javadev.model.Configuration;
import com.pgs.javadev.model.Direction;
import com.pgs.javadev.ui.validator.DirectionValidator;
import com.pgs.javadev.ui.validator.HeightValidator;
import com.pgs.javadev.ui.validator.LeaftValidator;
import com.pgs.javadev.ui.validator.Validator;

public class MainView {

    private IOHandler ioHandler;

    public MainView(final IOHandler ioHandler) {
        this.ioHandler = ioHandler;
    }

    public Configuration getConfiguration() {
        printHello();
        return new Configuration(
                getHeight(),
                getLeaf(),
                getDirection()
        );
    }

    private void printHello() {
        ioHandler.println(Messages.HELLO);
    }

    private Integer getHeight() {
        return Integer.parseInt(getUserChoice(Messages.PROMPT_HEIGHT, new HeightValidator()));
    }

    private String getLeaf() {

        return getUserChoice(Messages.PROMPT_LEAF, new LeaftValidator());
    }

    private Direction getDirection() {
        return Direction.valueOf(getUserChoice(Messages.PROPMT_DIRECTION, new DirectionValidator()));
    }

    private String getUserChoice(final String prompt, Validator validator) {
        String out = null;
        do {
            ioHandler.println(prompt);
            String userChoice = ioHandler.readln();
            if (validator.isValid(userChoice)) {
                out = userChoice;
            }
        } while (out == null);

        return out;
    }

}
