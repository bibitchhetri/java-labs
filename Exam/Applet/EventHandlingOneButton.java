import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class EventHandlingOneButton extends Applet implements ActionListener {
    Button btn1 = new Button("Click Me");
    String str = "";

    public void init() {
        add(btn1);
        btn1.addActionListener(this);
    }

    public void paint(Graphics g) {
        g.drawString(str, 100, 100);
    }

    public void actionPerformed(ActionEvent e) {
        str = "Button Clicked";
        repaint();
    }
}