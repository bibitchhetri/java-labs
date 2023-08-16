import java.applet.Applet;
import java.awt.*;

public class DrawLineApplet extends Applet {
    public void paint(Graphics g) {
        // Triangle
        g.setColor(Color.red);
        g.drawLine(20, 20, 100, 20);
        g.setColor(Color.green);
        g.drawLine(20, 20, 20, 100);
        g.setColor(Color.blue);
        g.drawLine(100, 20, 20, 100);
        // Rectangle
        // g.drawLine(20, 20, 100, 20);
        // g.drawLine(20, 20, 20, 100);
        // g.drawLine(20, 100, 100, 100);
        // g.drawLine(100, 20, 100, 100);

    }
}