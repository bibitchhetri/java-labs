import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class RepaintDemo extends Applet implements ActionListener {

    private Color color = Color.RED;
    private Button button;

    public void init() {
        button = new Button("Change Color");
        button.addActionListener(this);
        add(button);
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(50, 50, 100, 100);
    }

    public void actionPerformed(ActionEvent e) {
        color = Color.GREEN;
        repaint();
    }
}
