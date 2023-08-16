import java.applet.Applet;
import java.awt.*;

public class CheckBoxGroupApplet extends Applet {
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox cb1 = new Checkbox("Java", cbg, true);
    Checkbox cb2 = new Checkbox("Python", cbg, false);
    Checkbox cb3 = new Checkbox("Rust", cbg, false);

    public void init() {
        add(cb1);
        // cb2.setState(true); // Checked by default
        add(cb2);
        add(cb3);
    }
}
