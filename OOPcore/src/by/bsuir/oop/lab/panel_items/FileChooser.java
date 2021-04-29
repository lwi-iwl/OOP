package by.bsuir.oop.lab.panel_items;

import by.bsuir.oop.lab.paint.Board;
import by.bsuir.oop.lab.shapes.Shape;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class FileChooser extends Component {
    private File selectedFile;
    JFileChooser fileChooser = new JFileChooser();

    public String saveFile(Board board) {
        fileChooser.setFileFilter(new FileNameExtensionFilter(".json files", "json"));
        fileChooser.setDialogTitle("Сохранение");
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            fileChooser.setVisible(true);
            if (selectedFile != null) {
                try {
                    FileOutputStream file = new FileOutputStream(selectedFile.getAbsolutePath() + ".json");
                    ObjectOutputStream object = new ObjectOutputStream(file);
                    object.writeObject(board.shapes);
                    System.out.println(board.shapes);
                    object.flush();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                return selectedFile.getAbsolutePath();
            }
            else
                return null;
        }
        else
            return null;
    }


    public String openFile(Board board) {
        fileChooser.setFileFilter(new FileNameExtensionFilter(".json files", "json"));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            fileChooser.setVisible(true);
            if (selectedFile != null) {
                board.shapes.clear();
                board.redo.clear();
                board.oldshapes.clear();
                try {
                    FileInputStream file = new FileInputStream(selectedFile.getAbsoluteFile());
                    ObjectInputStream object = new ObjectInputStream(file);
                    board.shapes = (ArrayList<Shape>) object.readObject();
                    board.redo.clear();
                    board.repaint();
                    object.close();
                    file.close();
                    board.oldshapes.clear();
                    board.oldshapes.addAll(board.shapes);

                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                return selectedFile.getAbsolutePath();
            }
            else
                return null;
        }
        else
            return null;
    }
}
