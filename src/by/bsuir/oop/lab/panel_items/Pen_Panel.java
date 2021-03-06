package by.bsuir.oop.lab.panel_items;

import javax.swing.*;
import java.awt.*;

public class Pen_Panel {


    private JPanel pen_panel;

    public Pen_Panel() {
        pen_panel = new JPanel();

        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        Color WHITE_GRAY = new Color(220, 220, 220);

        JColorChooser color_panel = new JColorChooser();
        color_panel.setPreviewPanel(null);
        color_panel.removeChooserPanel(color_panel.getChooserPanels()[4]);
        color_panel.removeChooserPanel(color_panel.getChooserPanels()[3]);
        color_panel.removeChooserPanel(color_panel.getChooserPanels()[2]);
        color_panel.removeChooserPanel(color_panel.getChooserPanels()[1]);
        color_panel.setPreviewPanel(new JPanel());
        color_panel.setSize(450, 110);
        color_panel.setLocation(sSize.width/1000, 0);
        pen_panel.add(color_panel);

        JButton polygon_button = new JButton("Выбрать размер кисти:");
        polygon_button.setSize(sSize.width/9, sSize.height/40);
        polygon_button.setLocation(sSize.width/1000 + sSize.width/11*4, sSize.width/200);
        polygon_button.setBackground(WHITE_GRAY);
        polygon_button.setLayout(new BorderLayout());
        pen_panel.add(polygon_button);

        JTextPane polygon_number = new JTextPane();
        polygon_number.setSize(sSize.width/35, sSize.height/40);
        polygon_number.setLocation(sSize.width/1000 + sSize.width/11*4 + sSize.width/85*10, sSize.width/200);
        polygon_number.setBackground(WHITE_GRAY);
        polygon_number.setLayout(new BorderLayout());
        pen_panel.add(polygon_number);
        pen_panel.setLayout(new BorderLayout());
    }


    public JComponent get_pen_panel() {
        return pen_panel;
    }

}
