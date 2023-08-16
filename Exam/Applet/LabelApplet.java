import java.applet.Applet;
import java.awt.*;

public class LabelApplet extends Applet {
    Label lb1 = new Label("First Name");
    TextField t1 = new TextField("Your Name");

    public void init() {
        add(lb1);
        add(t1);
    }
}
