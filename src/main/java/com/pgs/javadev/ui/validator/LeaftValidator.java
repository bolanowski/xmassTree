package com.pgs.javadev.ui.validator;

import static org.apache.commons.lang3.StringUtils.isBlank;

public class LeaftValidator implements Validator {

    public boolean isValid(final String input) {
        if (isBlank(input) || input.length() != 1) {
            return false;
        }
        return Character.isLetter(input.charAt(0));
    }
}
