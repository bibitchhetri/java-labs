import java.applet.Applet;
import java.awt.Graphics;

public class ParamTag extends Applet {
    public void paint(Graphics g) {
        String str = this.getParameter("msg");
        g.drawString(str, 100, 80);
    }
}
