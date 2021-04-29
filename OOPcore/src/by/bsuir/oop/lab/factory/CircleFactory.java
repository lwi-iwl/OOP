package by.bsuir.oop.lab.factory;

import by.bsuir.oop.lab.shapes.Circle;
import by.bsuir.oop.lab.shapes.Shape;

public class CircleFactory extends ShapeFactory{

    public Shape getShape() {
        return new Circle();
    }

    public String getName(){
        return "Окружность";
    }
}
