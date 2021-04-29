package by.bsuir.oop.lab.panel_items;

import javax.swing.*;
import java.awt.*;
import java.util.List;

import by.bsuir.oop.lab.OOPcore.PluginLoader;
import by.bsuir.oop.lab.factory.*;
import by.bsuir.oop.lab.mouse.Mouse;
import by.bsuir.oop.lab.shapes.Shape;


public class ShapesPanel {
    private Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
    private final JPanel shapesPanel;
    private ShapeFactory shapeFactory;
    private int xLocation = sSize.width / 1000;
    private int yLocation = sSize.width / 200;

    public ShapesPanel(Mouse mouse) {
        shapeFactory = new LineFactory();
        mouse.setShapeFactory(shapeFactory);
        shapesPanel = new JPanel();
        Color WHITE_GRAY = new Color(220, 220, 220);
        List<ShapeFactory> factories = new PluginLoader().getEveryFactory();
        for (ShapeFactory factory : factories) {
            JButton button = new JButton(factory.getName());
            button.setSize(sSize.width / 12, sSize.height / 40);
            button.setLocation(xLocation, yLocation);
            xLocation += sSize.width / 11;
            button.setBackground(WHITE_GRAY);
            button.setLayout(new BorderLayout());
            shapesPanel.add(button);
            button.addActionListener(e -> {
                shapeFactory = factory;
                mouse.setShapeFactory(shapeFactory);
            });
        }
    }


    public JComponent getShapesPanel() {
        return shapesPanel;
    }
}
