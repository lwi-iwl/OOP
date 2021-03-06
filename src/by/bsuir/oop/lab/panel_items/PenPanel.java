package by.bsuir.oop.lab.panel_items;

import javax.swing.*;
import java.awt.*;

public class PenPanel {


    private JPanel penPanel;

    public PenPanel() {
        penPanel = new JPanel();
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        Color WHITE_GRAY = new Color(220, 220, 220);

        JColorChooser colorPanel = new JColorChooser();
        colorPanel.setPreviewPanel(null);
        colorPanel.removeChooserPanel(colorPanel.getChooserPanels()[4]);
        colorPanel.removeChooserPanel(colorPanel.getChooserPanels()[3]);
        colorPanel.removeChooserPanel(colorPanel.getChooserPanels()[2]);
        colorPanel.removeChooserPanel(colorPanel.getChooserPanels()[1]);
        colorPanel.setPreviewPanel(new JPanel());
        colorPanel.setSize(450, 110);
        colorPanel.setLocation(sSize.width/1000, 0);
        penPanel.add(colorPanel);

        JButton polygon_button = new JButton("Выбрать размер кисти:");
        polygon_button.setSize(sSize.width/9, sSize.height/40);
        polygon_button.setLocation(sSize.width/1000 + sSize.width/11*4, sSize.width/200);
        polygon_button.setBackground(WHITE_GRAY);
        polygon_button.setLayout(new BorderLayout());
        penPanel.add(polygon_button);

        JTextPane polygon_number = new JTextPane();
        polygon_number.setSize(sSize.width/35, sSize.height/40);
        polygon_number.setLocation(sSize.width/1000 + sSize.width/11*4 + sSize.width/85*10, sSize.width/200);
        polygon_number.setBackground(WHITE_GRAY);
        polygon_number.setLayout(new BorderLayout());
        penPanel.add(polygon_number);
        penPanel.setLayout(new BorderLayout());
    }


    public JComponent getPenPanel() {
        return penPanel;
    }

}
