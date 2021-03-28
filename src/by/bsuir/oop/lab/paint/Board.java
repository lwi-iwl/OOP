package by.bsuir.oop.lab.paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import by.bsuir.oop.lab.mouse.Mouse;
import by.bsuir.oop.lab.shapes.Line;
import by.bsuir.oop.lab.shapes.Shape;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;

public class Board extends JPanel{

    public ArrayList<Shape> shapes = new ArrayList<>();
    Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();

    public Shape shape;
    public Board() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(sSize.width/2, sSize.height/5*2));
        new Mouse(this);
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Shape shape : shapes) {
            shape.draw(g2);
        }
    }

}
