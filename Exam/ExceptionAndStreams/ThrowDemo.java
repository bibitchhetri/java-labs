import java.util.Scanner;

class MaxAgeException extends Exception {
    @Override
    public String toString() {
        return "Message from toString()";
    }

    @Override
    public String getMessage() {
        return "Message from getMessage()";
    }
}

public class ThrowDemo {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        try {
            if (age > 100) {
                throw new MaxAgeException();
            }
            System.out.println("It is valid age");
        } catch (MaxAgeException e) {
            System.out.println("Caught MaxAgeException \n" + e.getMessage());
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println("Caught Exception " + e.getMessage());
        }
    }
}