package by.bsuir.oop.lab.window;
import javax.swing.*;

import by.bsuir.oop.lab.mouse.Mouse;
import by.bsuir.oop.lab.paint.Board;
import by.bsuir.oop.lab.panel_items.*;
import by.bsuir.oop.lab.shapes.Shape;

import java.util.ArrayList;


public class Panel {
    private final JPanel mainPanel;
    Board board;

    public Panel() {
        board = new Board();
        board.setFocusable(false);
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        Mouse mouse = new Mouse(board);
        WorkPanel wpanel = new WorkPanel(board);
        wpanel.setFocusable(false);
        mainPanel.add(wpanel.getWorkPanel());
        ShapesPanel spanel = new ShapesPanel(mouse);
        mainPanel.add(spanel.getShapesPanel());
        mainPanel.add(board);
        mainPanel.add(new PenPanel(mouse));

    }

    public JComponent getMainPanel() {


        return mainPanel;
    }

    public ArrayList<Shape> getUndo() {
        return board.getUndo();
    }

    public ArrayList<Shape> getRedo() {
        return board.getRedo();
    }

    public Board getBoard() {
        return board;
    }
}
