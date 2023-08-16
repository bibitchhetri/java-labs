class MyCustomException extends Exception {
    public MyCustomException(String errorMessage) {
        super(errorMessage);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;
            if (denominator == 0) {
                throw new MyCustomException("Denominator cannot be zero.");
            }
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (MyCustomException e) {
            System.out.println("Caught MyCustomException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
