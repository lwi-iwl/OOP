package by.bsuir.oop.lab.shapes;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Line extends Shape implements Serializable {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int size;
    private Color color;

    public void setParams(ArrayList<Integer> params, int size, Color color, Color fill)
    {
        this.size = size;
        this.color = color;
        this.x1 = params.get(0);
        this.y1 = params.get(1);
        this.x2 = params.get(params.size()-2);
        this.y2 = params.get(params.size()-1);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(size));
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
    }
}
