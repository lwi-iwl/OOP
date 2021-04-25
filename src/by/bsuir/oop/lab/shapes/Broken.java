package by.bsuir.oop.lab.shapes;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Broken extends Shape implements Serializable {

    private int[] x;
    private int[] y;
    private Color color;
    private int size;

    public void setParams(ArrayList<Integer> params, int size, Color color, Color fill)
    {
        this.size = size;
        this.color = color;
        this.x = new int[params.size()/2];
        this.y = new int[params.size()/2];
        for (int i = 0; i<(params.size()/2); i++)
        {
            x[i] = params.get(i*2);
            y[i] = params.get(i*2+1);
        }

    }


    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(size));
        g2.setColor(color);
        g2.drawPolyline(x, y, x.length);
    }

}
