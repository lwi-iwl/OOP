package by.bsuir.oop.lab.window;
import javax.swing.*;

import by.bsuir.oop.lab.paint.Board;
import by.bsuir.oop.lab.panel_items.*;


public class Panel {
    private JPanel mainPanel;

    public Panel() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        WorkPanel workPanel = new WorkPanel();
        mainPanel.add(work.getWorkPanel());

        Shapes_Panel s_panel = new Shapes_Panel();
        main_panel.add(s_panel.get_shapes_panel());

        main_panel.add(new Board());

        Pen_Panel p_panel = new Pen_Panel();
        main_panel.add(p_panel.get_pen_panel());

        //Короче переделывай все снейк кейсы)

    }

    public JComponent get_main_panel() {

        return main_panel;
    }
}
