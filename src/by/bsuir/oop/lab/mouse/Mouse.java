package by.bsuir.oop.lab.mouse;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import by.bsuir.oop.lab.paint.Board;
import by.bsuir.oop.lab.panel_items.ShapesPanel;
import by.bsuir.oop.lab.shapes.Circle;
import by.bsuir.oop.lab.shapes.Line;
import by.bsuir.oop.lab.shapes.Shape;

public class Mouse
{
    //public ShapesPanel shapePanel = new ShapesPanel();

    public Shape shape;
    int x;
    int y;
    boolean ispressed = false;

    public Mouse(Board board)
    {
        board.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent e) {
                if (ispressed) {
                    board.shapes.add(new Circle(x, y, e.getX(), e.getY()));
                }
                board.repaint();
            }
        });


        board.addMouseListener(new MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent e) {
      //          shape = shapePanel.shape;
                x = e.getX();
                y = e.getY();
                ispressed = true;
            }

            public void mouseReleased(java.awt.event.MouseEvent e) {
                ispressed = false;
                board.repaint();
            }

        });
    }
}