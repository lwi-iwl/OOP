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

    public void getParams(int x1, int y1, int x2, int y2)
    {
        this.x = x1;
        this.y = y1;
        this.width = x2 - x1;
        this.height = y2 - y1;
        if (width < 0) {
            x += width;
            width = -width;
        }
        if (height < 0) {
            y += height;
            height = -height;
        }
    }

    public void draw(Graphics g) {
            g.drawRect(x, y, width, height);
    }
}
