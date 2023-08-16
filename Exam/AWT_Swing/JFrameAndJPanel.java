import javax.swing.*;
import java.awt.*;

public class JFrameAndJPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Jframe");
        JPanel panel = new JPanel();
        JButton btn = new JButton("Click Me!");
        panel.setBackground(Color.white);
        panel.add(btn);
        frame.add(panel);
        frame.setSize(250, 250);
        frame.setVisible(true);
    }
}