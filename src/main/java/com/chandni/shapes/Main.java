package com.chandni.shapes;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.rotate();
        square.playSound();

        Circle circle = new Circle();
        circle.rotate();
        circle.playSound();

        Triangle triangle = new Triangle();
        triangle.rotate();
        triangle.playSound();

        Amoeba amoeba = new Amoeba();
        amoeba.rotate();
        amoeba.playSound();
    }
}
