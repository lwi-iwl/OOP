package by.bsuir.oop.lab.window;


import javax.swing.*;
import java.awt.*;
import by.bsuir.oop.lab.mouse.Mouse;

public class Window extends JFrame {

    public static void main (String[] args) {
        JFrame jf = new JFrame("For2D");
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        jf.setSize(sSize.width - 100, sSize.height - 100);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);

        Panel panel = new Panel();
        jf.add(panel.getMainPanel());
        jf.setVisible(true);
        jf.setResizable(false);
    }

}


