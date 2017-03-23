package com.pgs.javadev.builder;

import static java.lang.Math.abs;

class RightTreeBuilder extends AbstractTreeBuilder {

    public String build(String text, int height) {
        String tree = "";
        for (int i = 1; i < height * 2 ; i++) {
            tree += printLevel(0, height - abs(height - i ), text);
        }
        return tree;
    }
}
