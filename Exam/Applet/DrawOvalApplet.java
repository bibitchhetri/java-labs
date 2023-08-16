import java.applet.Applet;
import java.awt.*;

public class DrawOvalApplet extends Applet {
    public void paint(Graphics g) {
        g.drawOval(20, 20, 100, 50);
        g.setColor(Color.blue);
        g.fillOval(20, 100, 100, 50);
    }

}
