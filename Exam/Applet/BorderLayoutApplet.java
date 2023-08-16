import java.applet.Applet;
import java.awt.*;

public class BorderLayoutApplet extends Applet {
    BorderLayout bl = new BorderLayout();
    Button b1 = new Button("Play");
    Button b2 = new Button("Pause");
    Button b3 = new Button("Reset");
    Button b4 = new Button("Submit");

    public void init() {
        setLayout(bl);
        add("North", b1);
        add("East", b2);
        add("West", b3);
        add("South", b4);
    }
}