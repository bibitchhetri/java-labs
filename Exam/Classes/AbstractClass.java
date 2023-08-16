abstract class Phone {
    public void greet() {
        System.out.println("Phone says Hi!");
    }

    abstract public void on();

    abstract public void off();
}

class SmartPhone extends Phone {
    public void on() {
        System.out.println("SmartPhone is on..");
    }

    public void off() {
        System.out.println("SmartPhone is off..");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        SmartPhone sm = new SmartPhone();
        sm.on();
        sm.off();
        Phone ph = new SmartPhone(); // Dynamic method dispatch on Abstract class
        ph.greet();
        ph.on();
        ph.off();
    }
}
