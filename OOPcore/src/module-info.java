import by.bsuir.oop.lab.factory.*;
import by.bsuir.oop.lab.shapes.*;
module OOPcore {
    requires java.desktop;

    exports by.bsuir.oop.lab.shapes;
    exports by.bsuir.oop.lab.factory;

    uses Shape;
    uses ShapeFactory;

    provides Shape with Broken, Circle, Polygon, Rectangle, Triangle, Line;
    provides ShapeFactory with BrokenFactory, CircleFactory, LineFactory, PolygonFactory, RectangleFactory, TriangleFactory;
}