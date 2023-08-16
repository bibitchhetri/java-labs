import java.applet.*;
import java.awt.*;

public class Arc extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawArc(50, 50, 100, 60, 0, 180);
        g.setColor(Color.BLUE);
        g.drawArc(50, 100, 100, 40, 0, -180);
    }
}