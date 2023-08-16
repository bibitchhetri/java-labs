import java.util.Scanner;

class NegativeRadiusException extends Exception {
    public NegativeRadiusException(String errorMessage) {
        super(errorMessage);
    }
}

public class ThrowsDemo {
    public static double area(int rad) throws NegativeRadiusException {
        if (rad < 0) {
            throw new NegativeRadiusException("Negative value of radius");
        }
        return Math.PI * rad * rad;
    }

    public static void main(String[] args) {
        int rad;
        System.out.println("Enter radius of circle: ");
        Scanner sc = new Scanner(System.in);
        rad = sc.nextInt();
        try {
            double ar = area(rad);
            System.out.println("The area of circle is: " + ar);
        } catch (NegativeRadiusException e) {
            System.out.println(e.getMessage());
        }
        sc.close(); // close the scanner object after use
    }
}
