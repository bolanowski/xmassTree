package com.pgs.javadev.builder;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class LeftTreeBuilderTest {

    LeftTreeBuilder leftBuilder;

    @Before
    public void init() {
        leftBuilder = new LeftTreeBuilder();
    }

    @Test
    public void testSingleRow() {
        String tree = leftBuilder.build("x", 1);
        assertThat(tree, equalTo("x\n"));
    }

    @Test
    public void testEvenRow() {
        String tree = leftBuilder.build("x", 2);
        assertThat(tree, equalTo(
                " x\n" +
                        "xx\n" +
                        " x\n"));
    }

    @Test
    public void testOddRow() {
        String tree = leftBuilder.build("x", 3);
        assertThat(tree, equalTo(
                "  x\n" +
                        " xx\n" +
                        "xxx\n" +
                        " xx\n" +
                        "  x\n"));
    }
}
