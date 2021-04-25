package by.bsuir.oop.lab.shapes;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Polygon extends Shape implements Serializable {

    private int[] x;
    private int[] y;
    private int size;
    private Color color;
    private Color fill;

    public void setParams(ArrayList<Integer> params, int size, Color color, Color fill)
    {
        this.size = size;
        this.color = color;
        this.fill = fill;
        this.x = new int[params.size()/2+1];
        this.y = new int[params.size()/2+1];
        int i = 0;
        while (i<(params.size()/2))
        {
            x[i] = params.get(i*2);
            y[i] = params.get(i*2+1);
            i++;
        }
        x[i] = params.get(0);
        y[i] = params.get(1);
    }


    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(size));
        g.setColor(fill);
        g.fillPolygon(x, y, x.length);
        g.setColor(color);
        g.drawPolyline(x, y, x.length);
    }
}
