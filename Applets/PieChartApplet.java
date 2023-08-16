import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class PieChartApplet extends Applet {

    public void paint(Graphics g) {
        // Set up data
        double[] data = { 0.25, 0.35, 0.2, 0.2 };
        String[] labels = { "25%", "35%", "20%", "20%" };
        Color[] colors = { Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE };

        // Set up pie chart parameters
        int x = 100;
        int y = 100;
        int diameter = 100;
        int startAngle = 0;

        // Draw the pie chart
        for (int i = 0; i < data.length; i++) {
            g.setColor(colors[i]);
            int arcAngle = (int) (data[i] * 360);
            g.fillArc(x, y, diameter, diameter, startAngle, arcAngle);
            startAngle += arcAngle;
            g.drawString(labels[i], x + diameter + 10, y + i * 20);
        }
    }
}
