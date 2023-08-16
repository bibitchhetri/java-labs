import java.applet.Applet;
import java.awt.*;

public class CheckBoxApplet extends Applet {
    Checkbox cb1 = new Checkbox("Java");
    Checkbox cb2 = new Checkbox("Python");
    Checkbox cb3 = new Checkbox("Rust");

    public void init() {
        add(cb1);
        cb2.setState(true); // Checked by default
        add(cb2);
        add(cb3);
    }
}
