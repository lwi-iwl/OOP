package by.bsuir.oop.lab.panel;
import java.awt.*;
import javax.swing.*;


public class Panel extends JFrame {

    public Panel() {
        super("TipaPaint");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menu = new JMenuBar();
        menu.add(File());
        menu.add(Edit());
        //menu.add(Button_Shapes());
        JFrame jf = new JFrame("For2D");
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        jf.setJMenuBar(menu);
        jf.setSize(sSize.height - 100, sSize.height - 100);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setResizable(false);
    }

    private JMenu File()
    {
        JMenu file = new JMenu("Файл");
        JMenuItem create = new JMenuItem("Создать");
        JMenuItem save = new JMenuItem("Сохранить");
        JMenuItem save_as = new JMenuItem("Сохранить как");
        JMenuItem open = new JMenuItem("Открыть");
        file.add(create);
        file.add(save);
        file.add(save_as);
        file.add(open);

        return file;
    }

    private JMenu Edit()
    {
        JMenu edit = new JMenu("Редактирование");
        JMenuItem undo = new JMenuItem("Назад");
        JMenuItem redo = new JMenuItem("Вперёд");
        edit.add(undo);
        edit.add(redo);
        return edit;
    }

    /*private JMenu Button_Shapes()
    {
        JMenu button_shapes = new JMenu("Фигуры");
        JMenuItem direct = new JMenuItem("Прямая");
        JMenuItem rectangle = new JMenuItem("Прямоугольник");
        JMenuItem oval = new JMenuItem("Овал");
        button_shapes.add(direct);
        button_shapes.add(rectangle);
        button_shapes.add(oval);
        return button_shapes;
    }*/

}
