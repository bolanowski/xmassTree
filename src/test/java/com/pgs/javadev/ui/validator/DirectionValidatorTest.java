package com.pgs.javadev.ui.validator;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DirectionValidatorTest {

    @Test
    public void testValidation() {
        DirectionValidator validator = new DirectionValidator();
        assertTrue(validator.isValid("UP"));
        assertTrue(validator.isValid("DOWN"));
        assertTrue(validator.isValid("LEFT"));
        assertTrue(validator.isValid("RIGHT"));
        assertFalse(validator.isValid(null));
        assertFalse(validator.isValid(""));
    }

}
