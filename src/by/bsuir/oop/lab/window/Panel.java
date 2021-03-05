package by.bsuir.oop.lab.window;
import java.awt.*;
import javax.swing.*;
import by.bsuir.oop.lab.panel_items.Work_Panel;
import by.bsuir.oop.lab.panel_items.Shapes_Panel;

public class Panel extends JFrame {

    public Panel() {
        super("TipaPaint");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JFrame jf = new JFrame("For2D");
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        jf.setSize(sSize.width - 100, sSize.height - 100);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        Work_Panel w_panel = new Work_Panel();
        jf.add(w_panel.get_work_panel(), BorderLayout.NORTH);

        Shapes_Panel s_panel = new Shapes_Panel();
        jf.add(s_panel.get_shapes_panel());
        jf.setVisible(true);
        jf.setResizable(false);
    }

}
