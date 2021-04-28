package by.bsuir.oop.lab.factory;

import by.bsuir.oop.lab.shapes.Broken;
import by.bsuir.oop.lab.shapes.Shape;

public class BrokenFactory extends ShapeFactory{
    public Shape getShape() {
        return new Broken();
    }
}
