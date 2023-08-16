import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class BarChartApplet extends Applet {

    public void paint(Graphics g) {
        // Set up data
        int[] data = { 10, 20, 30, 40, 50 };
        String[] labels = { "Label 1", "Label 2", "Label 3", "Label 4", "Label 5" };
        Color[] colors = { Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE, Color.YELLOW };

        // Set up bar chart parameters
        int x = 100;
        int y = 100;
        int barWidth = 50;
        int barSpacing = 10;

        // Draw the bar chart
        for (int i = 0; i < data.length; i++) {
            g.setColor(colors[i]);
            int barHeight = data[i] * 5;
            g.fillRect(x + i * (barWidth + barSpacing), y - barHeight, barWidth, barHeight);
            g.drawString(labels[i], x + i * (barWidth + barSpacing), y + 20);
        }
    }
}
