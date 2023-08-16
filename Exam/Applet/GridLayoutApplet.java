import java.applet.Applet;
import java.awt.*;

public class GridLayoutApplet extends Applet {
    // GridLayout gl = new GridLayout();
    // GridLayout gl = new GridLayout(2, 3);
    GridLayout gl = new GridLayout(2, 3, 20, 10);
    Button b1 = new Button("Play");
    Button b2 = new Button("Pause");
    Button b3 = new Button("Reset");
    Button b4 = new Button("Submit");

    public void init() {
        setLayout(gl);
        add("North", b1);
        add("East", b2);
        add("West", b3);
        add("South", b4);
    }
}