/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package E_BookExamples;

/**
 *
 * @author Ramneek
 */
public class VariableDemo {
    //Intializing Global Variable which is called as Instance Variable 
    //for Class "Variable Demo"
    static int globalVar = 100;
    
    public static void printVar(){
        //Intializing Local Variable in this method
        globalVar = 50;
        System.out.println("Local Variable: "+globalVar); 
        // Will Print 50 since that is local to this method
    }
    public static void printArgVar(int argVar /*Declaring Argument Variable*/){
        System.out.println("Argument Variable: "+argVar);
    }
    public static void main(String[] args) {
        System.out.println("Global Variable: "+globalVar);
        printVar();
        printArgVar(150);
    }
}
