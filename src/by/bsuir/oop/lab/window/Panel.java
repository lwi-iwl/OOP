package by.bsuir.oop.lab.window;
import javax.swing.*;

import by.bsuir.oop.lab.paint.Board;
import by.bsuir.oop.lab.panel_items.*;


public class Panel {
    private JPanel mainPanel;

    public Panel() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        WorkPanel wpanel = new WorkPanel();
        mainPanel.add(wpanel.getWorkPanel());

        ShapesPanel spanel = new ShapesPanel();
        mainPanel.add(spanel.getShapesPanel());

        mainPanel.add(new Board());

        PenPanel ppanel = new PenPanel();
        mainPanel.add(ppanel.getPenPanel());

    }

    public JComponent getMainPanel() {


        return mainPanel;
    }
}
