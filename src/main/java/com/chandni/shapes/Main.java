package com.chandni.shapes;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<Shape> shapes = new ArrayList<>();

        Shape square = new Square();
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape amoeba = new Amoeba();
        shapes.add(square);
        shapes.add(circle);
        shapes.add(triangle);
        shapes.add(amoeba);

        for (Shape shape : shapes) {
            shape.rotate();
            shape.playSound();
        }

    }
}
