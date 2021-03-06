package by.bsuir.oop.lab.paint;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel{


    Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
    public Board() {
        setLocation(200, sSize.width/200);
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(sSize.width/2, sSize.height/2));
        setLayout(new BorderLayout());
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(20, 30, 300, 10);
        g.drawLine(0,0,200,200);
    }

}
