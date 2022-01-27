// 7. Write an applet that demonstrates the usage of any two mouse and keyboard events.

import java.awt.Graphics;
import java.awt.event.*;
import java.applet.*;

/*<applet code="Program07.class" height="300" width="300"> </applet>*/

public class Program07 extends Applet implements MouseListener, MouseMotionListener, KeyListener {
    String msg = "";
    int X = 10, Y = 20; // output co ordinates

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);
    }

    public void paint(Graphics g) {
        g.drawString(msg, X, Y);
    }

    public void mousePressed(MouseEvent me) {
        msg = "mouse pressed";
        repaint();
    }

    public void mouseClicked(MouseEvent me) {
        msg = "mouse Clicked";
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        msg = "mouse entered";
        repaint();
    }

    public void mouseExited(MouseEvent me) {
        msg = "mouse exited";
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        msg = "mouse released";
        repaint();
    }

    public void mouseMoved(MouseEvent me) {
        msg = "mouse moved";
        repaint();
    }

    public void mouseDragged(MouseEvent me) {
    }

    public void keyPressed(KeyEvent ke) {
        showStatus("Key Pressed");
    }

    public void keyReleased(KeyEvent ke) {
        showStatus("Key Up");
    }

    public void keyTyped(KeyEvent ke) {
    }
}