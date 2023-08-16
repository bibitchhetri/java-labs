import java.applet.Applet;
import java.awt.*;

public class DrawRectangleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawRect(20, 20, 100, 50);
        g.setColor(Color.green);
        g.fillRect(20, 100, 100, 50);
    }

}
