package com.pgs.javadev.builder;

import static org.apache.commons.lang3.StringUtils.repeat;

abstract class AbstractTreeBuilder implements TreeBuilder {

    private static final String SPACE = " ";
    private static final String NEW_LINE = "\n";

    public abstract String build(String text, int height);

    protected String printLevel(final int spacesCount, final int charsCount, final String leaf) {
        StringBuilder levelBuilder = new StringBuilder();
        levelBuilder.append(repeat(SPACE, spacesCount));
        levelBuilder.append(repeat(leaf, charsCount));
        levelBuilder.append(NEW_LINE);
        return levelBuilder.toString();
    }
}
