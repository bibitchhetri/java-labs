import java.applet.*;
import java.awt.*;

public class Polygon extends Applet {

    public void paint(Graphics g) {
        int x[] = { 20, 160, 100, 160, 20 };
        int y[] = { 20, 20, 60, 100, 100 };
        g.setColor(Color.red);
        g.drawPolyline(x, y, 5);
    }
}
