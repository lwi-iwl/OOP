package by.bsuir.oop.lab.panel_items;
import java.awt.*;
import javax.swing.*;

public class WorkPanel extends JFrame{


    private JPanel workPanel;

    public WorkPanel() {
        workPanel = new JPanel();
        setLocationRelativeTo(null);
        JMenuBar menu = new JMenuBar();
        menu.add(ButtonFile());
        menu.add(ButtonEdit());
        setJMenuBar(menu);
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        workPanel.setSize(sSize.width-100,sSize.height/10);
        workPanel.setLayout(new BorderLayout());
        workPanel.add(menu, BorderLayout.NORTH);
        workPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 75));
    }

    public JMenuItem ButtonFile()
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

    public JMenuItem ButtonEdit() {
        JMenu edit = new JMenu("Редактирование");
        JMenuItem undo = new JMenuItem("Назад");
        JMenuItem redo = new JMenuItem("Вперёд");
        edit.add(undo);
        edit.add(redo);
        return edit;
    }

    public JComponent getWorkPanel() {
        return workPanel;
    }

}
