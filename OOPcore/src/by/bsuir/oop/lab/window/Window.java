package by.bsuir.oop.lab.window;


import by.bsuir.oop.lab.OOPcore.PluginLoader;
import by.bsuir.oop.lab.shapes.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Window extends JFrame {
    JButton down, left, right, up;

    private ArrayList<by.bsuir.oop.lab.shapes.Shape> shapes = new ArrayList<>();
    private ArrayList<Shape> redo = new ArrayList<>();
    Panel mpanel = new Panel();
    PluginLoader pluginLoader = new PluginLoader();
    public Window() {
        JFrame jf = new JFrame("For2D");
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        jf.setSize(sSize.width - 100, sSize.height - 100);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);

        jf.add(mpanel.getMainPanel());
        jf.setVisible(true);
        jf.setResizable(false);
    }



    public static void main(String[] args) {
        Window window = new Window();
    }

}


