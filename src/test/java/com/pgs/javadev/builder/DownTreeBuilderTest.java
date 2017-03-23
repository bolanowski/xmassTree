package com.pgs.javadev.builder;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class DownTreeBuilderTest {

    DownTreeBuilder downBuilder;

    @Before
    public void init() {
        downBuilder = new DownTreeBuilder();
    }

    @Test
    public void testSingleRow() {
        String tree = downBuilder.build("x", 1);
        assertThat(tree, equalTo("x\n"));
    }

    @Test
    public void testEvenRow() {
        String tree = downBuilder.build("x", 2);
        assertThat(tree, equalTo(
                "xxx\n" +
                " x\n"));
    }

    @Test
    public void testOddRow() {
        String tree = downBuilder.build("x", 3);
        assertThat(tree, equalTo(
                "xxxxx\n" +
                " xxx\n" +
                "  x\n"));
    }
}
