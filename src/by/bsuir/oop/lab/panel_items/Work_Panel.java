package by.bsuir.oop.lab.panel_items;
import java.awt.*;
import javax.swing.*;

public class Work_Panel extends JFrame{


    private JPanel work_panel;

    public Work_Panel() {
        work_panel = new JPanel();
        work_panel.setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        JMenuBar menu = new JMenuBar();
        menu.add(Button_File());
        menu.add(Button_Edit());
        menu.add(Button_Shapes());
        setJMenuBar(menu);
        work_panel.setSize(100,100);
        work_panel.setLayout(new BorderLayout());
        work_panel.add(menu, BorderLayout.NORTH);
    }

    public JMenu Button_File()
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

    public JMenu Button_Edit()
    {
        JMenu edit = new JMenu("Редактирование");
        JMenuItem undo = new JMenuItem("Назад");
        JMenuItem redo = new JMenuItem("Вперёд");
        edit.add(undo);
        edit.add(redo);
        return edit;
    }

    public JMenu Button_Shapes()
    {
        JMenu button_shapes = new JMenu("Фигуры");
        JMenuItem direct = new JMenuItem("Прямая");
        JMenuItem rectangle = new JMenuItem("Прямоугольник");
        JMenuItem oval = new JMenuItem("Овал");
        button_shapes.add(direct);
        button_shapes.add(rectangle);
        button_shapes.add(oval);
        return button_shapes;
    }

    public JComponent getGUI() {
        return work_panel;
    }

}
