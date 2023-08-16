import java.util.*;

class Employee {
    private int id;
    private String name;

    public Employee() {
        id = 1;
        name = "Rahul";
    }

    public Employee(String name) {
        id = 2;
        this.name = name;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setId(int identity) {
        id = identity;
    }

    public void setName(String empName) {
        name = empName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Intro {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println(e1.getId());
        System.out.println(e1.getName());

        Employee e2 = new Employee("Janam");
        System.out.println(e2.getId());
        System.out.println(e2.getName());

        Employee e3 = new Employee("Avi", 3);
        System.out.println(e2.getId());
        System.out.println(e3.getName());

        Employee e4 = new Employee();
        e4.setId(4);
        e4.setName("Sudip");
        System.out.println(e3.getId());
        System.out.println(e4.getName());
    }
}