package by.bsuir.oop.lab.shapes;

import java.awt.*;

public class Rectangle extends Shape{
    int x;
    int y;
    int width;
    int height;
    public Rectangle()
    {
    }
    public void Parameters(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void draw(Graphics g) {
        g.drawRect(x, y, width, height);
    }
}
