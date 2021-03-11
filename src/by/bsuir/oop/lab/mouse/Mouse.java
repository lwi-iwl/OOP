package by.bsuir.oop.lab.mouse;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import by.bsuir.oop.lab.paint.Board;

public class Mouse extends Applet implements MouseMotionListener, MouseListener{
    int width, height;
    int mx, my;
    int isPressed = 0;

    public void init() {
        width = getSize().width;
        height = getSize().height;
        setBackground( Color.black );


        addMouseListener( this );
        addMouseMotionListener( this );
    }

    public void mouseEntered( MouseEvent e ) {

    }
    public void mouseExited( MouseEvent e ) {

    }
    public void mouseClicked( MouseEvent e ) {

    }
    public void mousePressed( MouseEvent e ) {
        isPressed = 1;
    }
    public void mouseReleased( MouseEvent e ) {
        isPressed = 0;
    }
    public void mouseMoved( MouseEvent e ) {

        mx = e.getX();
        my = e.getY();

        repaint();
        e.consume();
    }
    public void mouseDragged( MouseEvent e ) {
        mx = e.getX();
        my = e.getY();

        repaint();
        e.consume();
    }

    public int getMx()
    {
        return mx;
    }

    public int getMy()
    {
        return my;
    }

    public int getIsPressed() {return isPressed;}

    public void paint(Graphics g) {
        g.drawLine(0,0,mx, my);
    }

}