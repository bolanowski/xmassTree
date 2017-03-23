package com.pgs.javadev.ui.validator;

import com.pgs.javadev.model.Direction;

import java.util.Objects;

public class DirectionValidator implements Validator {

    public boolean isValid(final String input) {
        if (Objects.isNull(input)) {
            return false;
        }
        try {
            Direction.valueOf(input);
        } catch (IllegalArgumentException ex) {
            return false;
        }
        return true;
    }
}
