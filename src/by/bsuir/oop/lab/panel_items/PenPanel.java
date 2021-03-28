package by.bsuir.oop.lab.panel_items;

import javax.swing.*;
import java.awt.*;

public class PenPanel extends JPanel{

    public PenPanel() {
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
        add(colorPanel);



        JButton polygonButton = new JButton("Выбрать размер кисти:");
        polygonButton.setSize(sSize.width/9, sSize.height/40);
        polygonButton.setLocation(sSize.width/1000 + sSize.width/11*4, sSize.width/200);
        polygonButton.setBackground(WHITE_GRAY);
        polygonButton.setLayout(new BorderLayout());
        add(polygonButton);

        JTextPane polygonNumber = new JTextPane();
        polygonNumber.setSize(sSize.width/35, sSize.height/40);
        polygonNumber.setLocation(sSize.width/1000 + sSize.width/11*4 + sSize.width/85*10, sSize.width/200);
        polygonNumber.setBackground(WHITE_GRAY);
        polygonNumber.setLayout(new BorderLayout());
        add(polygonNumber);
        setLayout(new BorderLayout());
    }
}
