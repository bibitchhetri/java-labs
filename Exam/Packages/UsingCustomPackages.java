/* Use 
 javac -d . *java   -> to create the package in java
*/

import operation.Calculator;
import operation.ArithmeticOp.Add;
import operation.ArithmeticOp.Subtract;

public class UsingCustomPackages {
    public static void main(String[] args) {
        System.out.println("Using Custom packages ");
        Calculator cal = new Calculator();
        cal.printVal();
        Add ad = new Add();
        ad.printVal();
        Subtract sub = new Subtract();
        sub.printVal();
    }
}
