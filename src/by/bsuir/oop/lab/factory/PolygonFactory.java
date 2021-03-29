package by.bsuir.oop.lab.factory;

import by.bsuir.oop.lab.shapes.Circle;
import by.bsuir.oop.lab.shapes.Shape;

public class PolygonFactory {

    PolygonFactory() {

    }
    public Shape GetShape() {
        return new Circle();
    }
}
