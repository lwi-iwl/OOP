package by.bsuir.oop.lab.window;
import javax.swing.*;

import by.bsuir.oop.lab.mouse.Mouse;
import by.bsuir.oop.lab.paint.Board;
import by.bsuir.oop.lab.panel_items.*;
import by.bsuir.oop.lab.shapes.Shape;

import java.awt.event.ActionEvent;
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



        InputMap input = board.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        input.put(KeyStroke.getKeyStroke("ctrl pressed Z"), "undo");
        input.put(KeyStroke.getKeyStroke("ctrl pressed X"), "redo");

        board.getActionMap().put("undo", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (board.shapes.size() != 0) {
                    board.redo.add(board.shapes.get(board.shapes.size() - 1));
                    board.shapes.remove(board.shapes.size() - 1);
                    board.repaint();
                }
            }
        });

        board.getActionMap().put("redo", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (board.redo.size() != 0) {
                    board.shapes.add(board.redo.get(board.redo.size() - 1));
                    board.redo.remove(board.redo.size() - 1);
                    board.repaint();
                }
            }
        });


    }

    public JComponent getMainPanel() {
        return mainPanel;
    }

}
