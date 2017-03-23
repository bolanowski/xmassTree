package com.pgs.javadev.builder;

class DownTreeBuilder extends AbstractTreeBuilder {

    public String build(String text, int height) {
        String tree = "";
        for (int i = height; i > 0; i--) {
            tree += printLevel(height - i, 2 * i - 1, text);
        }
        return tree;
    }
}
