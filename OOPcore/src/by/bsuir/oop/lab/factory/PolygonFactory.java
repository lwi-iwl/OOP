package by.bsuir.oop.lab.factory;

import by.bsuir.oop.lab.shapes.Polygon;
import by.bsuir.oop.lab.shapes.Shape;

public class PolygonFactory extends ShapeFactory{

    public PolygonFactory() {

    }
    public Shape getShape() {
        return new Polygon();
    }
}
