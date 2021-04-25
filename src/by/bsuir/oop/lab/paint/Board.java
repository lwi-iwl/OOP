package by.bsuir.oop.lab.paint;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


import by.bsuir.oop.lab.shapes.Shape;


public class Board extends JPanel{

    public ArrayList<Shape> shapes = new ArrayList<>();
    public ArrayList<Shape> redo = new ArrayList<>();
    public ArrayList<Shape> oldshapes = new ArrayList<>();
    Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();

    public Board() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(sSize.width/2, sSize.height/5*2));
    }


    @Override
    public void paintComponent(Graphics g2) {
        super.paintComponent(g2);
        for (Shape shape : shapes) {
            shape.draw(g2);
        }
    }

    public ArrayList<Shape> getUndo() {
        return shapes;
    }

    public ArrayList<Shape> getRedo() {
        return redo;
    }
}
