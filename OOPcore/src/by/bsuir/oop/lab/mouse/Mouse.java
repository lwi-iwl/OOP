package by.bsuir.oop.lab.mouse;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import by.bsuir.oop.lab.factory.ShapeFactory;
import by.bsuir.oop.lab.paint.Board;
import by.bsuir.oop.lab.shapes.Shape;

import javax.swing.*;

public class Mouse {

    private ShapeFactory shapeFactory;
    private boolean isClicked = false;
    private Shape shape;
    public ArrayList<Integer> params = new ArrayList<>();
    private int size;
    private Color color;
    private Color fill;

    public void setShapeFactory(ShapeFactory shapeFactory) {
        this.shapeFactory = shapeFactory;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public void setFill(Color fill) {
        this.fill = fill;
    }

    public Mouse(Board board) {
        board.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent e) {
                if (isClicked) {
                    params.set(params.size() - 2, e.getX());
                    params.set(params.size() - 1, e.getY());
                    shape.setParams(params, size, color, fill);
                    board.repaint();
                }
            }
        });


        board.addMouseListener(new MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    if (!isClicked) {
                        board.redo.clear();
                        params.add(e.getX());
                        params.add(e.getY());
                        params.add(e.getX());
                        params.add(e.getY());

                        shape = shapeFactory.getShape();
                        shape.setParams(params, size, color, fill);
                        board.shapes.add(shape);
                        board.repaint();
                        isClicked = true;
                    } else {
                        params.add(e.getX());
                        params.add(e.getY());
                    }
                }
                if (SwingUtilities.isRightMouseButton(e)) {
                    if (isClicked) {
                        params.clear();
                        board.shapes.remove(board.shapes.size() - 1);
                        isClicked = false;
                    }
                }
                if (e.getClickCount() == 2 && !e.isConsumed()) {
                    isClicked = false;
                    params.clear();
                }
                board.repaint();
                System.out.println(params.size());
            }


        });
    }
}