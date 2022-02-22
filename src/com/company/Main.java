package com.company;

public class Main {

    public static void main(String[] args) {
        short age = 33;
        Girl monicaBellucci = new Girl(new Rose(), age);

        monicaBellucci.flower();
        monicaBellucci.age();

        Square square = new Square(5);
        Triangle triangle = new Triangle(5);
        Romb romb = new Romb(5);

        System.out.println();
        drawShape(square);
        System.out.println();
        drawShape(triangle);
        System.out.println();
        drawShape(romb);
    }

    public static void drawShape(Shape shape) {
        shape.draw();
    }
}
