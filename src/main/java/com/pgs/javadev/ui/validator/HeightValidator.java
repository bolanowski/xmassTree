package com.pgs.javadev.ui.validator;

public class HeightValidator implements Validator {

    public boolean isValid(final String input) {
        int height;
        try {
            height = Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
            return false;
        }
        if (height < 1 || height > 20) {
            return false;
        }
        return true;
    }
}
