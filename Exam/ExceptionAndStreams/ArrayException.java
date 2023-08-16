import java.util.*;
import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 7;
        arr[1] = 10;
        arr[2] = 13;
        int pos = 0;
        int divisor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array position to access data: ");
        pos = sc.nextInt();
        System.out.println("Enter the number you want divide the value with: ");
        divisor = sc.nextInt();
        try {
            System.out.println("The value at " + pos + " = " + arr[pos]);
            System.out.println(arr[pos] + "/" + divisor + " is " + arr[pos] / divisor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The position " + pos + " doesn't exists: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Can't Divide by 0 " + e);
        }

    }
}