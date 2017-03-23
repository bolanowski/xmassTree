package com.pgs.javadev.ui.validator;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HeightValidatorTest {

    @Test
    public void testValidation() {
        HeightValidator validator = new HeightValidator();
        assertFalse(validator.isValid("text"));
        assertFalse(validator.isValid("1.1"));
        assertFalse(validator.isValid("0"));
        assertFalse(validator.isValid(null));
        assertFalse(validator.isValid("21"));
        assertFalse(validator.isValid("9999999999999999999999999999999999999999999999999999999999999999999999"));
        assertTrue(validator.isValid("1"));
        assertTrue(validator.isValid("20"));
    }

}
