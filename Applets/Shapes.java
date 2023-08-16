import java.awt.*;
import java.applet.Applet;

public class Shapes extends Applet {
    public void init() {
        setBackground(Color.black);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Hello World", 20, 20);
        g.clearRect(20, 20, 100, 100);
        g.setColor(Color.magenta);
        g.drawRoundRect(40, 40, 100, 80, 50, 50);
        g.fillRoundRect(40, 140, 100, 80, 50, 50);
        g.setColor(Color.green);
        g.draw3DRect(40, 230, 100, 80, true);
        g.setColor(Color.orange);
        g.fill3DRect(180, 20, 100, 80, true);
        g.drawOval(180, 120, 100, 80);
        g.fillOval(180, 220, 100, 80);
    }
}
