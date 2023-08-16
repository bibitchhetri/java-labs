class Base {
    int x;
    int y;

    public void setX(int x) {
        System.out.println("Setting x from Base class");
        this.x = x;
    }

    public void setY(int y) {
        System.out.println("Setting y from Base class");
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Derived extends Base {
    private int z;

    public void setZ(int z) {
        System.out.println("Setting z from Derived class");
        this.z = z;
    }

    public int getZ() {
        return z;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Base b1 = new Base();
        b1.setX(10);
        System.out.println(b1.getX());
        Derived d1 = new Derived();
        d1.setX(20);
        System.out.println(d1.getX());
        Derived d2 = new Derived();
        d2.setZ(30);
        System.out.println(d2.getZ());
        // b2.setZ(30); // invalid access of data from derived class from base class
        // System.out.println(b2.getZ());
    }
}