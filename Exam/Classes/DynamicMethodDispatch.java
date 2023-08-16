class Phone {
    public void greet() {
        System.out.println("Phone says Hi!");
    }

    public void on() {
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone {
    public void smartGreet() {
        System.out.println("SmartPhone says Hi!");
    }

    public void on() {
        System.out.println("Turning on SmartPhone");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone ph = new SmartPhone();
        ph.greet();
        ph.on();
    }
}
