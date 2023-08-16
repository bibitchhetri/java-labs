import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClockApplet extends Applet implements Runnable {
    private Thread thread;
    private boolean running;

    public void init() {
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        setFont(new Font("Arial", Font.BOLD, 24));
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            running = true;
            thread.start();
        }
    }

    public void stop() {
        if (thread != null) {
            running = false;
            thread = null;
        }
    }

    public void run() {
        while (running) {
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
        Date now = new Date();
        String timeStr = sdf.format(now);
        g.clearRect(0, 0, getWidth(), getHeight());
        g.drawString(timeStr, 50, 50);
    }
}
