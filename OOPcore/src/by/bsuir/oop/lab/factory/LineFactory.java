package by.bsuir.oop.lab.factory;

import by.bsuir.oop.lab.shapes.Line;
import by.bsuir.oop.lab.shapes.Shape;

public class LineFactory extends ShapeFactory {



    public Shape getShape() {
        return new Line();
    }

    public String getName(){
        return "Линия";
    }
}
