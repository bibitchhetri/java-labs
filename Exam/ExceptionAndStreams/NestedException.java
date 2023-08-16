public class NestedException {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block starts.");

            try {
                // Inner try block
                System.out.println("Inner try block starts.");

                int numerator = 10;
                int denominator = 0;
                int result = numerator / denominator; // This will throw an ArithmeticException

                System.out.println("Result: " + result);

                System.out.println("Inner try block ends.");
            } catch (ArithmeticException e) {
                // Inner catch block
                System.out.println("Caught an ArithmeticException in the inner try block: " + e.getMessage());

                System.out.println("Inner catch block ends.");
            }

            System.out.println("Outer try block ends.");
        } catch (Exception e) {
            // Outer catch block
            System.out.println("Caught an Exception in the outer try block: " + e.getMessage());

            System.out.println("Outer catch block ends.");
        }
    }
}
