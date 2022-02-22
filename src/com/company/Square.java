package com.company;

public class Square extends Shape{

    public Square(int dimension) {
        super(dimension);
    }

    @Override
    public void draw() {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
