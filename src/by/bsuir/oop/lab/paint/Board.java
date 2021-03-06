package by.bsuir.oop.lab.paint;

import javax.swing.*;
import java.awt.*;
import by.bsuir.oop.lab.mouse.Mouse;

public class Board extends JPanel{


    Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
    Mouse mouse1 = new Mouse();
    public Board() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(sSize.width/2, sSize.height/5*2));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(20, 30, 300, 10);
        int x = mouse1.getMx();
        g.drawLine(0,0,x,200);
    }

}
