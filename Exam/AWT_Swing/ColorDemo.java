import java.awt.*;
import javax.swing.*;

public class ColorDemo extends JFrame {
    public ColorDemo() {
        super("Using Colors");
        setSize(400, 400);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillRect(20, 50, 100, 40);
        g.setColor(new Color(255, 255, 255));
        g.fillOval(20, 100, 100, 80);
    }

    public static void main(String[] args) {
        ColorDemo c1 = new ColorDemo();
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
