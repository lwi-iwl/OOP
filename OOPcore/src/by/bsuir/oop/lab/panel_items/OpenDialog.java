package by.bsuir.oop.lab.panel_items;

import by.bsuir.oop.lab.paint.Board;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OpenDialog {
    private JDialog d;
    FileChooser fileChooser = new FileChooser();
    public OpenDialog(Board board) {
        JFrame f = new JFrame();
        d = new JDialog(f, "Сохранить?", true);
        d.setLayout(new FlowLayout());
        JButton yes = new JButton("Да");
        yes.addActionListener(e -> {
            if (board.getFileName() == null) {
                board.setFileName(fileChooser.saveFile(board));
            }
            else {
                try {
                    FileOutputStream output = new FileOutputStream(board.getFileName());
                    ObjectOutputStream object = new ObjectOutputStream(output);
                    object.writeObject(board.shapes);
                    object.flush();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
            d.setVisible(false);
            board.setFileName(fileChooser.openFile(board));
        });

        JButton no = new JButton("Нет");
        no.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                d.setVisible(false);
                board.setFileName(fileChooser.openFile(board));
            }
        });

        JButton cancel = new JButton("Отмена");
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                d.setVisible(false);
            }
        });

        JLabel savelabel = new JLabel("Сохранить?");
        savelabel.setLocation(100, 100);
        d.add(savelabel);
        d.add(yes);
        d.add(no);
        d.add(cancel);
        d.setSize(300, 100);
        d.setLocation(500, 300);
    }

    public void setVisible() {
        d.setVisible(true);
    }
}
