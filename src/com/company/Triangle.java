package com.company;

public class Triangle extends Shape {

    public Triangle(int dimension) {
        super(dimension);
    }

    @Override
    public void draw() {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }

}
