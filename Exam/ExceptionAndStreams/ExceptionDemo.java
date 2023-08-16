import java.util.*;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
        try {
            System.out.println("First/Second: " + num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception due to " + e);
            System.out.println("Cannot divide by zero");
        }
    }
}