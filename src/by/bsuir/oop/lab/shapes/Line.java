package by.bsuir.oop.lab.shapes;

import by.bsuir.oop.lab.paint.Board;

import java.awt.*;

public class Line extends Shape{
    int x1;
    int y1;
    int x2;
    int y2;
    public Line(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public void Parameters(int x, int y, int width, int height)
    {
    }
    @Override
    public void draw(Graphics g) {

        g.drawLine(x1, y1, x2, y2);
    }
}
