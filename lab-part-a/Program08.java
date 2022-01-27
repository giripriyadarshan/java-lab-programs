// 8. Write a menu driven program to draw different geometrical figures with menu options like: 1) Draw Line 2) Draw Rectangle 3) Draw Ellipse 4)Draw Polygon.

import java.applet.*;
import java.awt.*;

/*<applet code="Program08.class"  width="1000" height="1000"> </applet>*/

public class Program08 extends Applet {
    int x = 300, y = 100, r = 50;

    public void paint(Graphics g) {
        g.drawLine(30, 300, 200, 10);
        g.drawOval(x - r, y - r, 100, 100);
        g.drawRect(400, 50, 200, 100);
    }
}