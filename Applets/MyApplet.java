import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(java.awt.Color.red);
        g.fillRect(25, 25, 100, 50);
    }
}

