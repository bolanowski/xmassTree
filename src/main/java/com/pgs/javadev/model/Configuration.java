package com.pgs.javadev.model;

public class Configuration {

    private Integer height;

    private String leaf;

    private Direction direction;

    public Configuration(final Integer height, final String leaf, final Direction direction) {
        this.height = height;
        this.leaf = leaf;
        this.direction = direction;
    }

    public Integer getHeight() {
        return height;
    }

    public String getLeaf() {
        return leaf;
    }

    public Direction getDirection() {
        return direction;
    }
}
