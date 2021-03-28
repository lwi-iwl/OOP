package by.bsuir.oop.lab.shapes;

import java.awt.*;

public class Triangle extends Shape{
    int x;
    int y;
    int width;
    int height;
    public Triangle()
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
        int xarray[] = { x, x+width, (x+width)/2, x };
        int yarray[] = { y+height, y+height, y, y+height};
        g.drawPolygon(xarray, yarray, 4);
    }
}
