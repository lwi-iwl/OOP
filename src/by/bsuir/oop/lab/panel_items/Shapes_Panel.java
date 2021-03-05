package by.bsuir.oop.lab.panel_items;

import javax.swing.*;
import java.awt.*;

public class Shapes_Panel{
    private JPanel shapes_panel;

    public Shapes_Panel() {
        shapes_panel = new JPanel();
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        Color WHITE_GRAY = new Color(220, 220, 220);


        JButton rectangle_button = new JButton("Прямоугольник");
        rectangle_button.setSize(sSize.width/12, sSize.height/40);
        rectangle_button.setLocation(sSize.width/1000, sSize.width/200);
        rectangle_button.setBackground(WHITE_GRAY);
        rectangle_button.setLayout(new BorderLayout());
        shapes_panel.add(rectangle_button, BorderLayout.EAST);

        JButton circle_button = new JButton("Овал");
        circle_button.setSize(sSize.width/12, sSize.height/40);
        circle_button.setLocation(sSize.width/1000 + sSize.width/11, sSize.width/200);
        circle_button.setBackground(WHITE_GRAY);
        circle_button.setLayout(new BorderLayout());
        shapes_panel.add(circle_button, BorderLayout.CENTER);

        JButton triangle_button = new JButton("Треугольник");
        triangle_button.setSize(sSize.width/12, sSize.height/40);
        triangle_button.setLocation(sSize.width/1000 + sSize.width/11*2, sSize.width/200);
        triangle_button.setBackground(WHITE_GRAY);
        triangle_button.setLayout(new BorderLayout());
        shapes_panel.add(triangle_button, BorderLayout.CENTER);

        JButton trapezoid_button = new JButton("Трапеция");
        trapezoid_button.setSize(sSize.width/12, sSize.height/40);
        trapezoid_button.setLocation(sSize.width/1000 + sSize.width/11*3, sSize.width/200);
        trapezoid_button.setBackground(WHITE_GRAY);
        trapezoid_button.setLayout(new BorderLayout());
        shapes_panel.add(trapezoid_button, BorderLayout.CENTER);


        JButton polygon_button = new JButton("Многоугольник:");
        polygon_button.setSize(sSize.width/12, sSize.height/40);
        polygon_button.setLocation(sSize.width/1000 + sSize.width/11*4, sSize.width/200);
        polygon_button.setBackground(WHITE_GRAY);
        polygon_button.setLayout(new BorderLayout());
        shapes_panel.add(polygon_button, BorderLayout.CENTER);

        JTextPane polygon_number = new JTextPane();
        polygon_number.setSize(sSize.width/35, sSize.height/40);
        polygon_number.setLocation(sSize.width/1000 + sSize.width/11*5, sSize.width/200);
        polygon_number.setBackground(WHITE_GRAY);
        polygon_number.setLayout(new BorderLayout());
        shapes_panel.add(polygon_number, BorderLayout.CENTER);


        shapes_panel.setLayout(new BorderLayout());
    }


    public JComponent get_shapes_panel() {
        return shapes_panel;
    }
}
