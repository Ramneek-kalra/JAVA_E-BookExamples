/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_BookExamples;

import java.util.Scanner;

/**
 *
 * @author Ramneek
 */
public class FloatNumbers {
    public static void main(String[] args) {
        float a,b,c;
        
        Scanner scanInput = new Scanner(System.in);
        a = scanInput.nextFloat();
        b = scanInput.nextFloat();
        c = a + b;
        System.out.println("Addition of A and B is\n"+c);
    }
}
