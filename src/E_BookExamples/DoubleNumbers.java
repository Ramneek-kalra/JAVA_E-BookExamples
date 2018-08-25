package E_BookExamples;

import java.util.Scanner;

/**
 *
 * @author Ramneek
 */
public class DoubleNumbers {
    public static void main(String[] args) {
        //Initialization of three variables of Double Datatype
        double a,b,c;
        
        Scanner scanInput = new Scanner(System.in);
        a = scanInput.nextDouble();
        b = scanInput.nextDouble();
        c = a + b;
        System.out.println("Addition of A and B is\n"+c);
    }
}
