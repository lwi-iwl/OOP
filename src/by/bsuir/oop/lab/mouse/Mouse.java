package by.bsuir.oop.lab.mouse;

import java.awt.event.*;
import java.util.ArrayList;

import by.bsuir.oop.lab.factory.ShapeFactory;
import by.bsuir.oop.lab.paint.Board;
import by.bsuir.oop.lab.shapes.Shape;

public class Mouse<shape>
{

    public ArrayList<ShapeFactory> shapesFactory = new ArrayList<>();
    int x;
    int y;
    boolean ispressed = false;
    public Shape shape;

    public Mouse(Board board)
    {
        board.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent e) {
                if (ispressed) {
                    shape = board.shapes.get(board.shapes.size() - 1);
                    shape.getParams(x, y, e.getX(), e.getY());
                    board.shapes.set(board.shapes.size() - 1, shape);
                    board.repaint();
                }
                board.repaint();
            }
        });


        board.addMouseListener(new MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent e) {
                x = e.getX();
                y = e.getY();
                ispressed = true;
                int index = 0;
                for (ShapeFactory shapeFactory : shapesFactory) {
                    System.out.println(index);
                            index++;
                    shape = shapeFactory.getShape();
                    shape.getParams(x, y, e.getX(), e.getY());
                    board.shapes.add(shape);
                    board.repaint();
                }
            }

            public void mouseReleased(java.awt.event.MouseEvent e) {
                ispressed = false;
                board.repaint();
            }

        });
    }
}