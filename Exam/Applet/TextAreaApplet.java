import java.applet.Applet;
import java.awt.*;

public class TextAreaApplet extends Applet {
    TextArea t1 = new TextArea("Hello");

    public void init() {
        // t1.setText("World");
        // t1.setEditable(false);
        add(t1);
    }

    public void paint(Graphics g) {
        g.drawString("Result: " + t1.getText(), 80, 250);

    }
}