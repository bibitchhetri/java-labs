import java.applet.Applet;
import java.awt.*;

public class DrawPolygonApplet extends Applet {
    int x[] = { 60, 20, 100 };
    int y[] = { 20, 100, 100 };

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillPolygon(x, y, 3);
    }
}
