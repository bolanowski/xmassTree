package com.pgs.javadev.builder;

class UpTreeBuilder extends AbstractTreeBuilder {

    public String build(String text, int height) {
        String tree = "";
        for (int i = 0; i < height; i++) {
            tree += printLevel(height - i - 1, 2 * i + 1, text);
        }
        return tree;
    }

}
