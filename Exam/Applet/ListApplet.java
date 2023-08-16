import java.applet.Applet;
import java.awt.*;

public class ListApplet extends Applet {
    List city = new List(2); // use List(2,true) for multiple selection

    public void init() {
        city.add("Pokhara");
        city.add("Kathmandu");
        city.add("Chitwan");
        city.add("Dharan");
        city.add("Butwal");
        add(city);
        // city.setMultipleMode(true); for multiple selection
        city.select(1); // to choose which list is to be selected by default
    }
}