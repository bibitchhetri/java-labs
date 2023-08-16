import java.applet.Applet;
import java.awt.*;

public class FlowLayoutApplet extends Applet {
    FlowLayout fl = new FlowLayout();
    // FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
    // FlowLayout fl = new FlowLayout(FlowLayout.LEFT,30,30);
    // FlowLayout fl = new FlowLayout(FlowLayout.RIGHT);
    // FlowLayout fl = new FlowLayout(FlowLayout.RIGHT,30,30);

    Button b1 = new Button("Button1");
    Button b2 = new Button("Button2");
    Button b3 = new Button("Button3");
    Button b4 = new Button("Button4");
    Button b5 = new Button("Button5");
    Button b6 = new Button("Button6");

    public void init() {
        // this.setLayout(fl); //valid for current object
        setLayout(fl);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }
}