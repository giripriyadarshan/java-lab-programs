// 6. Write an applet which receives fontname and fontsize as parameters and displays a string using these parameters

import java.awt.*;
import java.applet.Applet;

//<applet code="Program06.class" width="690" height="420"> <param name=message value="This is a parameter"></param> </applet>

public class Program06 extends Applet {
    String theFontName, message;
    Font f = new Font(theFontName, Font.BOLD, 17);

    public void paint(Graphics g) {
        g.setFont(f);
        g.drawString(message, 6, 69);
    }

    public void init() {
        message = getParameter("message");
        if (message == null)
            message = "This is an applet";
        theFontName = getParameter("font");
        if (theFontName == null)
            theFontName = "Times New Roman";
    }
}
