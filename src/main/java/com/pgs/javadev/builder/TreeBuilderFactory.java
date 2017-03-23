package com.pgs.javadev.builder;

import com.pgs.javadev.model.Direction;

public abstract class TreeBuilderFactory {

    public static AbstractTreeBuilder getTreeBuilder(Direction direction) {
        switch (direction) {
            case DOWN:
                return new DownTreeBuilder();
            case UP:
                return new UpTreeBuilder();
            case LEFT:
                return new LeftTreeBuilder();
            case RIGHT:
                return new RightTreeBuilder();
            default:
                throw new IllegalArgumentException();
        }
    }
}
