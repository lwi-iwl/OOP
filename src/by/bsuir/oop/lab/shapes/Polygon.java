package by.bsuir.oop.lab.shapes;

import java.awt.*;

public class Polygon {
    int x;
    int y;
    int numberofpoints;
    int width;
    int height;
    public Polygon(int x, int y, int width, int height, int numberofpoints)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.numberofpoints = numberofpoints;
    }
    public void Parameters(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void draw(Graphics g) {

    }
}
