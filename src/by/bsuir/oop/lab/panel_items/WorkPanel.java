package by.bsuir.oop.lab.panel_items;
import by.bsuir.oop.lab.paint.Board;

import java.awt.*;
import java.io.*;
import javax.swing.*;


public class WorkPanel extends JFrame{

    private final JPanel workPanel;
    FileChooser fileChooser = new FileChooser();
    public WorkPanel(Board board) {
        workPanel = new JPanel();
        setLocationRelativeTo(null);
        JMenuBar menu = new JMenuBar();
        menu.add(ButtonFile(board));
        menu.add(ButtonEdit(board));
        setJMenuBar(menu);
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        workPanel.setSize(sSize.width-100,sSize.height/10);
        workPanel.setLayout(new BorderLayout());
        workPanel.add(menu, BorderLayout.NORTH);
        workPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 75));
    }

    public JMenuItem ButtonFile(Board board)
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
        NewDialog newDialog = new NewDialog(board);
        OpenDialog openDialog = new OpenDialog(board);
        create.addActionListener(e -> {
            board.C.clear();
            board.C.addAll(board.shapes);
            board.C.retainAll(board.oldshapes);
            if (board.C.size() != board.shapes.size())
                newDialog.setVisible();
            else{
                board.shapes.clear();
                board.redo.clear();
                board.oldshapes.clear();
                board.setFileName(null);
                board.repaint();
            }
        });

        save.addActionListener(e -> {
            if (board.getFileName() == null) {
                board.setFileName(fileChooser.saveFile(board));
            }
            else {
                try {
                    FileOutputStream out = new FileOutputStream(board.getFileName());
                    ObjectOutputStream oos = new ObjectOutputStream(out);
                    oos.writeObject(board.shapes);
                    oos.flush();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
            board.oldshapes.clear();
            board.oldshapes.addAll(board.shapes);
        });

        save_as.addActionListener(e -> {
            board.setFileName(fileChooser.saveFile(board));
            board.oldshapes.clear();
            board.oldshapes.addAll(board.shapes);
        });

        open.addActionListener(e -> {
            board.C.clear();
            board.C.addAll(board.shapes);
            board.C.retainAll(board.oldshapes);
            if (board.C.size() != board.shapes.size()) {
                openDialog.setVisible();
            }
            else
                board.setFileName(fileChooser.openFile(board));
        });

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