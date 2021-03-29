package by.bsuir.oop.lab.factory;

import by.bsuir.oop.lab.shapes.Circle;
import by.bsuir.oop.lab.shapes.Line;
import by.bsuir.oop.lab.shapes.Shape;

public class LineFactory extends ShapeFactory {

    public LineFactory() {

    }

    public Shape getShape() {
        return new Line();
    }
}
