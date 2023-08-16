import java.applet.Applet;
import java.awt.*;

public class FontColorApplet extends Applet {
    Font obj = new Font("Times New Roman", Font.BOLD, 20);

    public void paint(Graphics g) {
        Color obj = new Color(125, 125, 125);
        g.setColor(Color.red);
        g.drawString("Coloring My Text", 100, 100);
        g.setColor(Color.blue);
        g.drawString("Another One", 100, 150);
        g.drawString("Another Color Detailes" + g.getColor().getRGB(), 100, 200);
        g.setColor(obj);
        g.drawString("Final Coloring", 100, 250);
        g.drawString("Final Color Details" + g.getColor(), 100, 300);
    }
}