import java.awt.*;
import java.awt.event.*;

public class ClosableFrame extends Frame {

    public ClosableFrame() {
        // Set the title of the frame
        setTitle("Closable Frame Example");

        // Create a panel for the content of the frame
        Panel contentPanel = new Panel();
        // contentPanel.setLayout(new BorderLayout());

        // // Create a label for the content panel
        // Label contentLabel = new Label("This is a closable frame.");
        // contentLabel.setAlignment(Label.CENTER);
        // contentPanel.add(contentLabel, BorderLayout.CENTER);

        // Add the content panel to the frame
        add(contentPanel);

        // Set the size of the frame
        setSize(400, 300);

        // Center the frame on the screen
        setLocationRelativeTo(null);

        // Make the frame visible
        setVisible(true);

        // Add a window listener to the frame
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); // Close the frame
            }
        });
    }

    public static void main(String[] args) {
        new ClosableFrame();
    }
}
