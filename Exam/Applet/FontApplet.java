import java.applet.Applet;
import java.awt.*;

public class FontApplet extends Applet {
    Font obj1 = new Font("Times New Roman", Font.BOLD, 20);
    Font obj2 = new Font("serif", Font.ITALIC, 20);

    public void paint(Graphics g) {
        g.setFont(obj1);
        g.drawString("Hello World!", 100, 80);
        g.drawString("Font Details: " + g.getFont(), 100, 100);
        g.setFont(obj2);
        g.drawString("This is Serif", 1000, 80);
        g.drawString("Font Details: " + g.getFont().getName(), 1000, 100);
        g.drawString("Font Style: " + g.getFont().getStyle(), 1000, 120);
    }
}