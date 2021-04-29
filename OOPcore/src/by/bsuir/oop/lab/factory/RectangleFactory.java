package by.bsuir.oop.lab.factory;

import by.bsuir.oop.lab.shapes.Rectangle;
import by.bsuir.oop.lab.shapes.Shape;

public class RectangleFactory extends ShapeFactory{

    public RectangleFactory() {

    }
    public Shape getShape() {
        return new Rectangle();
    }

    public String getName(){
        return "Прямоугольник";
    }
}
