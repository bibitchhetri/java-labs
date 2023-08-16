import java.util.Scanner;

class MaxAgeException extends Exception {
    public MaxAgeException(String errorMessage) {
        super(errorMessage);
    }
}

public class CustomThrowException {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        try {
            if (age > 100) {
                throw new MaxAgeException("Age can't be greater than 100");
            }
            System.out.println("It is valid age");
        } catch (MaxAgeException e) {
            System.out.println("Caught MaxAgeException " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception " + e.getMessage());
        }
    }
}