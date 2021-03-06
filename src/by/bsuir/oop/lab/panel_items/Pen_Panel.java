package by.bsuir.oop.lab.panel_items;

import javax.swing.*;
import java.awt.*;

public class Pen_Panel {


    private JPanel pen_panel;

    public Pen_Panel() {
        pen_panel = new JPanel();
        pen_panel.setLayout(new BorderLayout());
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        JColorChooser color_panel = new JColorChooser();
        color_panel.setPreviewPanel(null);
        color_panel.removeChooserPanel(color_panel.getChooserPanels()[4]);
        color_panel.removeChooserPanel(color_panel.getChooserPanels()[3]);
        color_panel.removeChooserPanel(color_panel.getChooserPanels()[2]);
        color_panel.removeChooserPanel(color_panel.getChooserPanels()[1]);
        color_panel.setPreviewPanel(new JPanel());
        color_panel.setSize(450, 250);
        color_panel.setLocation(sSize.width/1000, sSize.width/1000);
        pen_panel.add(color_panel);
    }


    public JComponent get_pen_panel() {
        return pen_panel;
    }

}
