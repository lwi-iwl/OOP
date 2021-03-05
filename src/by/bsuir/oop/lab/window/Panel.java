package by.bsuir.oop.lab.window;
import java.awt.*;
import javax.swing.*;
import by.bsuir.oop.lab.panel_items.Work_Panel;

public class Panel extends JFrame {

    public Panel() {
        super("TipaPaint");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JFrame jf = new JFrame("For2D");
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        jf.setSize(sSize.height - 100, sSize.height - 100);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        Work_Panel w_panel = new Work_Panel();
        jf.add(w_panel.getGUI(), BorderLayout.CENTER);
        jf.setVisible(true);
        jf.setResizable(false);
    }

}
