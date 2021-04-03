package by.bsuir.oop.lab.shapes;

import java.awt.*;
import java.util.ArrayList;

public abstract class Shape {
    public abstract void draw(Graphics g);
    public abstract void setParams(ArrayList<Integer> params, int size, Color color, Color fill);
}
