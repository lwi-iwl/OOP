package by.bsuir.oop.lab.shapes;

import java.awt.*;
import java.util.ArrayList;

public class Rectangle extends Shape{
    private int x;
    private int y;
    private int width;
    private int height;
    private int size;
    private Color color;
    private Color fill;

    public void setParams(ArrayList<Integer> params, int size, Color color, Color fill)
    {
        this.size = size;
        this.color = color;
        this.fill = fill;
        this.x = params.get(0);
        this.y = params.get(1);
        this.width = params.get(params.size()-2) - params.get(0);
        this.height = params.get(params.size()-1) - params.get(1);
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
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(size));
        g.setColor(fill);
        g.fillRect(x, y, width, height);
        g.setColor(color);
        g.drawRect(x, y, width, height);
    }
}
