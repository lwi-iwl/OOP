package by.bsuir.oop.lab.panel;
import java.awt.*;
import javax.swing.*;


public class Panel extends JFrame {

    public Panel() {
        super("TipaPaint");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menu = new JMenuBar();
        menu.add(Button_Shapes());


        JFrame jf = new JFrame("For2D");
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        jf.setJMenuBar(menu);
        jf.setSize(sSize.height - 100, sSize.height - 100);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setResizable(false);
    }

    private JMenu Button_Shapes()
    {
        JMenu button_shapes = new JMenu("Фигуры");
        JMenuItem open = new JMenuItem("Прямоугольник");
        button_shapes.add(open);
        return button_shapes;
    }

}
