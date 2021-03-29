package by.bsuir.oop.lab.factory;

import by.bsuir.oop.lab.shapes.Circle;
import by.bsuir.oop.lab.shapes.Shape;
import by.bsuir.oop.lab.shapes.Triangle;

public class CircleFactory extends ShapeFactory{
    public CircleFactory() {

    }
    public Shape getShape() {
        return new Circle();
    }
}
