import java.awt.*;

public class PanelDemo extends Frame {
    PanelDemo(String title) {
        super(title);
        addComponent("North", new Button("North"));
        addComponent("South", new Button("South"));
        addComponent("Center", new Button("Center"));
        addComponent("East", new Button("East"));
        addComponent("West", new Button("West"));
    }

    public void addComponent(String region, Component component) {
        Panel panel = new Panel();
        panel.add(component);
        add(region, panel);
    }

    public static void main(String[] args) {
        PanelDemo pd = new PanelDemo("BorderPanelExample");
        pd.setSize(200, 150);
        pd.setVisible(true);

    }
}