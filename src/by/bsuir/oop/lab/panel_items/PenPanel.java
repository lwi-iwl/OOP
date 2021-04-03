package by.bsuir.oop.lab.panel_items;

import by.bsuir.oop.lab.mouse.Mouse;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class PenPanel extends JPanel{

    public PenPanel(Mouse mouse) {
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        Color WHITE_GRAY = new Color(220, 220, 220);

        JLabel colorLabel = new JLabel("Установить цвет кисти:");
        colorLabel.setSize(sSize.width/10, sSize.height/40);
        colorLabel.setLocation(sSize.width/1000+18, sSize.width/200);
        colorLabel.setBackground(WHITE_GRAY);
        colorLabel.setLayout(new BorderLayout());
        add(colorLabel);
        setLayout(new BorderLayout());

        JLabel fillColor = new JLabel("Установить цвет заливки:");
        fillColor.setSize(sSize.width/10, sSize.height/40);
        fillColor.setLocation(sSize.width/1000 + sSize.width/4+92, sSize.width/200);
        fillColor.setBackground(WHITE_GRAY);
        fillColor.setLayout(new BorderLayout());
        add(fillColor);
        setLayout(new BorderLayout());

        JColorChooser colorPanel = new JColorChooser(Color.black);
        colorPanel.setPreviewPanel(null);
        colorPanel.removeChooserPanel(colorPanel.getChooserPanels()[4]);
        colorPanel.removeChooserPanel(colorPanel.getChooserPanels()[3]);
        colorPanel.removeChooserPanel(colorPanel.getChooserPanels()[2]);
        colorPanel.removeChooserPanel(colorPanel.getChooserPanels()[1]);
        colorPanel.setPreviewPanel(new JPanel());
        colorPanel.setSize(450, 110);
        colorPanel.setLocation(sSize.width/1000, 50);
        add(colorPanel);

        colorPanel.getSelectionModel().addChangeListener(e -> mouse.setColor(colorPanel.getColor()));
        mouse.setColor(Color.black);

        JColorChooser fillPanel = new JColorChooser();
        fillPanel.setPreviewPanel(null);
        fillPanel.removeChooserPanel(fillPanel.getChooserPanels()[4]);
        fillPanel.removeChooserPanel(fillPanel.getChooserPanels()[3]);
        fillPanel.removeChooserPanel(fillPanel.getChooserPanels()[2]);
        fillPanel.removeChooserPanel(fillPanel.getChooserPanels()[1]);
        fillPanel.setPreviewPanel(new JPanel());
        fillPanel.setSize(450, 110);
        fillPanel.setLocation(sSize.width/1000 + sSize.width/10*3, 50);
        add(fillPanel);
        fillPanel.getSelectionModel().addChangeListener(e -> mouse.setFill(fillPanel.getColor()));
        mouse.setFill(Color.white);

        JSlider slider = new JSlider(0, 10, 1);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setSize(200, sSize.height/20);
        slider.setLocation(sSize.width/1000 + sSize.width/6*4, 50);
        add(slider);
        slider.addChangeListener(e -> mouse.setSize(slider.getValue()));

        JLabel sizeLabel = new JLabel("Установить размер:");
        sizeLabel.setSize(sSize.width/10, sSize.height/40);
        sizeLabel.setLocation(sSize.width/1000 + sSize.width/6*4, sSize.width/200);
        sizeLabel.setBackground(WHITE_GRAY);
        sizeLabel.setLayout(new BorderLayout());
        add(sizeLabel);
        setLayout(new BorderLayout());
    }
}
