package by.bsuir.oop.lab.panel_items;
import java.awt.*;
import javax.swing.*;

public class Work_Panel extends JFrame{


    private JPanel work_panel;

    public Work_Panel() {
        work_panel = new JPanel();
        setLocationRelativeTo(null);
        JMenuBar menu = new JMenuBar();
        menu.add(Button_File());
        menu.add(Button_Edit());
        setJMenuBar(menu);
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        work_panel.setSize(sSize.width-100,sSize.height/10);
        work_panel.setLayout(new BorderLayout());
        work_panel.add(menu, BorderLayout.NORTH);
        work_panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 75));
    }

    public JMenuItem Button_File()
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

    public JMenuItem Button_Edit() {
        JMenu edit = new JMenu("Редактирование");
        JMenuItem undo = new JMenuItem("Назад");
        JMenuItem redo = new JMenuItem("Вперёд");
        edit.add(undo);
        edit.add(redo);
        return edit;
    }

    public JComponent get_work_panel() {
        return work_panel;
    }

}
