import java.applet.Applet;
import java.awt.*;

public class ButtonApplet extends Applet {
    Button btn1 = new Button("Submit");
    Button bth2 = new Button("Reset");

    public void init() {
        add(btn1);
        add(bth2);
    }
}