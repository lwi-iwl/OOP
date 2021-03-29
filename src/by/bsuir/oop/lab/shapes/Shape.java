package by.bsuir.oop.lab.shapes;

import java.awt.*;

public abstract class Shape {

    public Shape(){

    }

    public abstract void draw(Graphics g);
    public abstract void getParams(int x1, int y1, int x2, int y2);
}
