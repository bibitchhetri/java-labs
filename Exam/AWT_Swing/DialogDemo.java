import javax.swing.JOptionPane;

public class DialogDemo {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "What is your name?", "Input Dialog",
                JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!", "Message Dialog", JOptionPane.INFORMATION_MESSAGE);
    }
}
