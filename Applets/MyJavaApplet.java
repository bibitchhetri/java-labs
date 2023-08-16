import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class MyJavaApplet extends Applet {

    private Image myImage;

    public void init() {
        myImage = getImage(getCodeBase(), "image.jpg"); // Load the image
    }

    public void paint(Graphics g) {
        g.drawImage(myImage, 0, 0, this); // Draw the image at position (0, 0)
    }
}
