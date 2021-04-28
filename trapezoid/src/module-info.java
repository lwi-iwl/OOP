import trapezoid.*;
import by.bsuir.oop.lab.shapes.Shape;
import by.bsuir.oop.lab.factory.ShapeFactory;

module trapezoid {
    requires java.desktop;
    requires OOPcore;

    exports trapezoid;

    provides Shape with TrapezoidS;
    provides ShapeFactory with TrapezoidFactory;
}