package by.bsuir.oop.lab.window;
import javax.swing.*;

import by.bsuir.oop.lab.mouse.Mouse;
import by.bsuir.oop.lab.paint.Board;
import by.bsuir.oop.lab.panel_items.*;
import by.bsuir.oop.lab.shapes.Line;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Panel {
    private JPanel mainPanel;

    public Panel() {
        Board board = new Board();
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        WorkPanel wpanel = new WorkPanel();
        mainPanel.add(wpanel.getWorkPanel());
        Mouse mouse = new Mouse(board);
        ShapesPanel spanel = new ShapesPanel(mouse);
        mainPanel.add(spanel.getShapesPanel());

        mainPanel.add(board);
        mainPanel.add(new PenPanel(mouse));

    }

    public JComponent getMainPanel() {


        return mainPanel;
    }
}
