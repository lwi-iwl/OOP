package by.bsuir.oop.lab.window;
import javax.swing.*;

import by.bsuir.oop.lab.paint.Board;
import by.bsuir.oop.lab.panel_items.*;


public class Panel {
    private JPanel main_panel;

    public Panel() {
        main_panel = new JPanel();
        main_panel.setLayout(new BoxLayout(main_panel, BoxLayout.Y_AXIS));

        Work_Panel w_panel = new Work_Panel();
        main_panel.add(w_panel.get_work_panel());

        Shapes_Panel s_panel = new Shapes_Panel();
        main_panel.add(s_panel.get_shapes_panel());

        main_panel.add(new Board());

        Pen_Panel p_panel = new Pen_Panel();
        main_panel.add(p_panel.get_pen_panel());

    }

    public JComponent get_main_panel() {

        return main_panel;
    }
}
