import java.awt.Frame;

public class FrameDemo extends Frame {
    public FrameDemo(String title) {
        super(title);
    }

    public static void main(String[] args) {
        FrameDemo fd = new FrameDemo("Hello Frame!");
        fd.setVisible(true);
        fd.setSize(200, 300);
    }
}