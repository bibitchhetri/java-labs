import java.applet.Applet;
import java.awt.*;

public class ChoiceApplet extends Applet {
    Choice city = new Choice();

    public void init() {
        city.addItem("Kathmandu");
        city.addItem("Pokhara");
        city.addItem("Chitwan");
        city.addItem("Dharan");
        add(city);
        city.select("Pokhara");
    }

    public void paint(Graphics g) {
        g.drawString("Result: " + city.getSelectedIndex(), 20, 20);
    }
}
