import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class EventHandlingTwoButton extends Applet implements ActionListener {
    Button btn1 = new Button("OK");
    Button btn2 = new Button("Cancel");
    String str = "";

    public void init() {
        add(btn1);
        add(btn2);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }

    public void paint(Graphics g) {
        g.drawString(str, 100, 100);
    }

    public void actionPerformed(ActionEvent e) {
        str = e.getActionCommand();
        if (str.equals("OK")) {
            str = "OK Clicked";
        }
        if (str.equals("Cancel")) {
            str = "Cancel Clicked";
        }
        repaint();
    }
}