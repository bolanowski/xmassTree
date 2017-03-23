package com.pgs.javadev.builder;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class UpTreeBuilderTest {

    UpTreeBuilder upBuilder;

    @Before
    public void init() {
        upBuilder = new UpTreeBuilder();
    }

    @Test
    public void testSingleRow() {
        String tree = upBuilder.build("x", 1);
        assertThat(tree, equalTo("x\n"));
    }

    @Test
    public void testEvenRow() {
        String tree = upBuilder.build("x", 2);
        assertThat(tree, equalTo(
                " x\n" +
                        "xxx\n"));
    }

    @Test
    public void testOddRow() {
        String tree = upBuilder.build("x", 3);
        assertThat(tree, equalTo(
                "  x\n" +
                        " xxx\n" +
                        "xxxxx\n"));
    }
}
