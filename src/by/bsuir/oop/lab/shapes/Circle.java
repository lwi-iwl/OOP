package by.bsuir.oop.lab.shapes;

import java.awt.*;

public class Circle extends Shape {
    int x;
    int y;
    int width;
    int height;
    public Circle(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void draw(Graphics g) {
        g.drawOval(x, y, width, height);
    }

}
