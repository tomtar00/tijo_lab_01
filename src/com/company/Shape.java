package com.company;

public abstract class Shape implements Drawable {

    protected int dimension;

    public Shape(int dimension) {
        this.dimension = dimension;
    }

    @Override
    public void draw() {
        System.err.println("Abstract class draw() method was called!");
    }
}
