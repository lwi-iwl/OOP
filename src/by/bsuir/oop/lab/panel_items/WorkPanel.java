package by.bsuir.oop.lab.panel_items;
import by.bsuir.oop.lab.mouse.Mouse;
import by.bsuir.oop.lab.paint.Board;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class WorkPanel extends JFrame{


    private JPanel workPanel;

    public WorkPanel(Board board) {
        workPanel = new JPanel();
        setLocationRelativeTo(null);
        JMenuBar menu = new JMenuBar();
        menu.add(ButtonFile());
        menu.add(ButtonEdit(board));
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

    public JMenuItem ButtonEdit(Board board) {
        JMenu edit = new JMenu("Редактирование");
        JMenuItem undo = new JMenuItem("Назад");
        JMenuItem redo = new JMenuItem("Вперёд");
        edit.add(undo);
        edit.add(redo);
        undo.addActionListener(e -> {
            if (board.shapes.size() != 0) {
                board.redo.add(board.shapes.get(board.shapes.size() - 1));
                board.shapes.remove(board.shapes.size() - 1);
                board.repaint();
            }
        });

        redo.addActionListener(e -> {
            if (board.redo.size() != 0) {
                board.shapes.add(board.redo.get(board.redo.size() - 1));
                board.redo.remove(board.redo.size() - 1);
                board.repaint();
            }
        });

        return edit;
    }

    public JComponent getWorkPanel() {
        return workPanel;
    }

}
