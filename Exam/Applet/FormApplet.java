import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class FormApplet extends Applet implements ActionListener {
    String name = "";
    String gender = "";
    int age;
    Label l1 = new Label("Enter Name: ");
    TextField n = new TextField(10);
    Choice c = new Choice();
    Label l2 = new Label("Age: ");
    Label l3 = new Label("Select Gender: ");
    CheckboxGroup g = new CheckboxGroup();
    Checkbox m = new Checkbox("Male", g, true);
    Checkbox f = new Checkbox("Female", g, true);
    Button b1 = new Button("Submit");

    public void init() {
        add(l1);
        add(n);
        add(l2);
        add(m);
        add(f);
        add(l3);
        c.add("18");
        c.add("19");
        c.add("20");
        c.add("21");
        add(c);
        add(b1);
        b1.addActionListener(this);
    }

    public void paint(Graphics g) {
        g.drawString("Name: " + name, 20, 200);
        g.drawString("Age: " + age, 20, 220);
        g.drawString("Gender: " + gender, 20, 240);
    }

    public void actionPerformed(ActionEvent e) {
        name = n.getText();
        gender = g.getSelectedCheckbox().getLabel();
        age = Integer.parseInt(c.getSelectedItem());
        repaint();
    }
}