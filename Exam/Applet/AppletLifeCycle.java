import java.applet.Applet;
import java.awt.Graphics;

public class AppletLifeCycle extends Applet {
    int count = 1;

    public void init() {
        System.out.println("init Method" + count++);
    }

    public void start() {
        System.out.println("start method" + count++);
    }

    public void stop() {
        System.out.println("stop method" + count++);
    }

    public void destroy() {
        System.out.println("destroy method" + count++);
    }

    public void paint(Graphics g) {
        System.out.println("paint method " + count++);
        g.drawString("Hello World!", 75, 75);
    }
}
