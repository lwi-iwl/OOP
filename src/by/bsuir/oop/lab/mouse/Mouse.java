package by.bsuir.oop.lab.mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.applet.Applet;

public class Mouse extends
        Applet implements MouseMotionListener, MouseListener{
    int width, height;
    int mx, my;  // the mouse coordinates
    boolean isButtonPressed = false;

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

    }
    public void mouseReleased( MouseEvent e ) {

    }
    public void mouseMoved( MouseEvent e ) {

    }
    public void mouseDragged( MouseEvent e ) {
        mx = e.getX();
        my = e.getY();
        repaint();
        e.consume();
    }

    public int return_mx()
    {
        return mx;
    }

    public int return_my()
    {
        return my;
    }

}