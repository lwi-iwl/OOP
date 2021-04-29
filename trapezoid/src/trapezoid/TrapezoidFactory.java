package trapezoid;

import by.bsuir.oop.lab.factory.ShapeFactory;
import by.bsuir.oop.lab.shapes.Shape;

public class TrapezoidFactory extends ShapeFactory {
    public Shape getShape() {
        return new TrapezoidS();
    }

    public String getName(){
        return "Трапеция";
    }
}
