package by.bsuir.oop.lab.panel_items;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import by.bsuir.oop.lab.shapes.Line;

public class ShapesPanel {
    private JPanel shapesPanel;

    Graphics g2;
    public ShapesPanel(Graphics g) {
        this.g2 = g;
        shapesPanel = new JPanel();
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        Color WHITE_GRAY = new Color(220, 220, 220);

        JButton lineButton = new JButton("Линия");
        lineButton.setSize(sSize.width/12, sSize.height/40);
        lineButton.setLocation(sSize.width/1000, sSize.width/200);
        lineButton.setBackground(WHITE_GRAY);
        lineButton.setLayout(new BorderLayout());
        shapesPanel.add(lineButton);

        JButton rectangleButton = new JButton("Прямоугольник");
        rectangleButton.setSize(sSize.width/12, sSize.height/40);
        rectangleButton.setLocation(sSize.width/1000+ sSize.width/11, sSize.width/200);
        rectangleButton.setBackground(WHITE_GRAY);
        rectangleButton.setLayout(new BorderLayout());
        shapesPanel.add(rectangleButton);

        JButton circleButton = new JButton("Овал");
        circleButton.setSize(sSize.width/12, sSize.height/40);
        circleButton.setLocation(sSize.width/1000 + sSize.width/11*2, sSize.width/200);
        circleButton.setBackground(WHITE_GRAY);
        circleButton.setLayout(new BorderLayout());
        shapesPanel.add(circleButton);

        JButton triangleButton = new JButton("Треугольник");
        triangleButton.setSize(sSize.width/12, sSize.height/40);
        triangleButton.setLocation(sSize.width/1000 + sSize.width/11*3, sSize.width/200);
        triangleButton.setBackground(WHITE_GRAY);
        triangleButton.setLayout(new BorderLayout());
        shapesPanel.add(triangleButton);


        JButton userButton = new JButton("Загрузить плагин");
        userButton.setSize(sSize.width/11, sSize.height/40);
        userButton.setLocation(sSize.width/1000 + sSize.width/11*4, sSize.width/200);
        userButton.setBackground(WHITE_GRAY);
        userButton.setLayout(new BorderLayout());
        shapesPanel.add(userButton);


        JButton polygonButton = new JButton("Многоугольник:");
        polygonButton.setSize(sSize.width/12, sSize.height/40);
        polygonButton.setLocation(sSize.width/1000 + sSize.width/11*5 + sSize.width/120, sSize.width/200);
        polygonButton.setBackground(WHITE_GRAY);
        polygonButton.setLayout(new BorderLayout());
        shapesPanel.add(polygonButton);

        JTextPane polygonNumber = new JTextPane();
        polygonNumber.setSize(sSize.width/35, sSize.height/40);
        polygonNumber.setLocation(sSize.width/1000 + sSize.width/11*6 + sSize.width/400, sSize.width/200);
        polygonNumber.setBackground(WHITE_GRAY);
        polygonNumber.setLayout(new BorderLayout());
        shapesPanel.add(polygonNumber);


        shapesPanel.setLayout(new BorderLayout());
    }


    public JComponent getShapesPanel() {
        return shapesPanel;
    }
}
