package by.bsuir.oop.lab.factory;

import by.bsuir.oop.lab.shapes.Shape;
import by.bsuir.oop.lab.shapes.Triangle;

public class TriangleFactory extends ShapeFactory {

    public Shape getShape() {
        return new Triangle();
    }

    public String getName(){
        return "Треугольник";
    }
}
