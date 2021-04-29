import by.bsuir.oop.lab.shapes.Shape;
import by.bsuir.oop.lab.factory.ShapeFactory;
import trapezoid.TrapezoidFactory;
import trapezoid.TrapezoidS;

module trapezoid {
    requires java.desktop;
    requires OOPcore;

    provides Shape with TrapezoidS;
    provides ShapeFactory with TrapezoidFactory;
}