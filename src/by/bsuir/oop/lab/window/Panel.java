package by.bsuir.oop.lab.window;
import javax.swing.*;

import by.bsuir.oop.lab.paint.Board;
import by.bsuir.oop.lab.panel_items.*;


public class Panel {
    private JPanel mainPanel;

    public Panel() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        WorkPanel w_panel = new WorkPanel();
        mainPanel.add(w_panel.getWorkPanel());

        shapesPanel s_panel = new shapesPanel();
        mainPanel.add(s_panel.getShapesPanel());

        mainPanel.add(new Board());

        PenPanel p_panel = new PenPanel();
        mainPanel.add(p_panel.getPenPanel());

    }

    public JComponent getMainPanel() {

        return mainPanel;
    }
}
