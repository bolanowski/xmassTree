package com.pgs.javadev.ui.validator;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LeafValidatorTest {

    @Test
    public void testValidation() {
        LeaftValidator validator = new LeaftValidator();
        assertFalse(validator.isValid("text"));
        assertFalse(validator.isValid("\n"));
        assertFalse(validator.isValid("1.1"));
        assertFalse(validator.isValid("1"));
        assertFalse(validator.isValid(""));
        assertFalse(validator.isValid(null));
        assertTrue(validator.isValid("x"));
        assertTrue(validator.isValid("X"));
    }

}
