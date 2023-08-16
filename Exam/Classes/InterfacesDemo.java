interface Bicycle {
    int a = 10;

    default void move() {
        System.out.println("moving...");
    }

    void applyBreaks();

    void pushHorn();

}

class AvonCycle implements Bicycle {
    public void applyBreaks() {
        System.out.println("applying breaks...");
    }

    public void pushHorn() {
        System.out.println("pushing horn...");
    }
}

public class InterfacesDemo {
    public static void main(String[] args) {
        AvonCycle av = new AvonCycle();
        av.applyBreaks();
        av.pushHorn();
        av.move();
        System.out.println(av.a);
    }
}
