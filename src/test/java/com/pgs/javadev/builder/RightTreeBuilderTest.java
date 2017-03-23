package com.pgs.javadev.builder;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class RightTreeBuilderTest {

    RightTreeBuilder rightBuilder;

    @Before
    public void init() {
        rightBuilder = new RightTreeBuilder();
    }

    @Test
    public void testSingleRow() {
        String tree = rightBuilder.build("x", 1);
        assertThat(tree, equalTo("x\n"));
    }

    @Test
    public void testEvenRow() {
        String tree = rightBuilder.build("x", 2);
        assertThat(tree, equalTo(
                        "x\n" +
                        "xx\n" +
                        "x\n"));
    }

    @Test
    public void testOddRow() {
        String tree = rightBuilder.build("x", 3);
        assertThat(tree, equalTo(
                        "x\n" +
                        "xx\n" +
                        "xxx\n" +
                        "xx\n" +
                        "x\n"));
    }
}
