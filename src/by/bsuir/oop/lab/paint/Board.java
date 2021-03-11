package by.bsuir.oop.lab.paint;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel{


    Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();

    public Board() {

        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(sSize.width/2, sSize.height/5*2));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

    }

}
