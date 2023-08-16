import javax.xml.transform.Source;

class Base {
    private int x, y;

    public Base() {
        System.out.println("Default Base class constructor");
        x = 10;
        y = 20;
    }

    public Base(int x) {
        System.out.println("Printing from Base Constructor with 1 argument");
        this.x = x;
        System.out.println("Value of X = " + x);
    }
}

class Derived extends Base {
    private int y;

    public Derived() {
        super();
        System.out.println("Printing from Default Derived class constructor");
    }

    public Derived(int x) {
        super(x);
        System.out.println("Printing from Default Derived class constructor with 1 args");
    }

    public Derived(int x, int y) {
        super(x);
        System.out.println("Printing from Derived Constructor with 2 argument");
        this.y = y;
        System.out.println("Value of Y = " + y);
    }
}

class DerivedOfDerived extends Derived {
    int z;

    public DerivedOfDerived() {
        super();
        System.out.println("Printing from DerivedOfDerived class default constructor");
    }

    public DerivedOfDerived(int x) {
        super(x);
        System.out.println("Printing from DerivedOfDerived class constructor with 1 args");
    }

    public DerivedOfDerived(int x, int y) {
        super(x, y);
        System.out.println("Printing from DerivedOfDerived class constructor with 2 args");
    }

    public DerivedOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("Printing from DerivedOfDerived class constructor with 3 args");
        this.z = z;
        System.out.println("Value of Z = " + z);
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        DerivedOfDerived dd1 = new DerivedOfDerived();
        DerivedOfDerived dd2 = new DerivedOfDerived(10);
        DerivedOfDerived dd3 = new DerivedOfDerived(10, 20);
        DerivedOfDerived dd4 = new DerivedOfDerived(10, 20, 30);
    }

}
