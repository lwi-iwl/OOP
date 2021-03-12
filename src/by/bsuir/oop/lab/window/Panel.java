package by.bsuir.oop.lab.window;
import javax.swing.*;

import by.bsuir.oop.lab.paint.Board;
import by.bsuir.oop.lab.panel_items.*;

import java.awt.*;


public class Panel {
    private JPanel mainPanel;

    public Panel() {
        Board board = new Board();
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        WorkPanel wpanel = new WorkPanel();
        mainPanel.add(wpanel.getWorkPanel());

        ShapesPanel spanel = new ShapesPanel(board);
        mainPanel.add(spanel.getShapesPanel());

        mainPanel.add(board);

        PenPanel ppanel = new PenPanel();
        mainPanel.add(ppanel.getPenPanel());

    }

    public JComponent getMainPanel() {


        return mainPanel;
    }
}
