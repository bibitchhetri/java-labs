import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.*;

public class MyPaintApplet extends Applet {

  private Color currentColor = Color.BLACK;

  public void init() {
    // set the applet size
    B
    setSize(400, 400);
  }

  public void paint(Graphics g) {
    // draw a rectangle using the current color
    g.setColor(currentColor);
    g.fillRect(100, 100, 200, 200);
  }

  public void mouseClicked(MouseEvent e) {
    // change the color to red on mouse click
    currentColor = Color.RED;
    // repaint the applet to update the color
    repaint();
  }

}
