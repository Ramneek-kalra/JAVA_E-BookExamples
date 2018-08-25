package E_BookExamples;

/**
 *
 * @author Ramneek
 */
public class booleanDatatype {
    public static void main(String[] args) {
        boolean statusCheck = false;
        int a = 10;
        int b = 20;
        //Checking if a < b or not using Conditional
        //Statements
        if(a <= b){
            statusCheck = true;
            System.out.println("A is less than B with value: "+statusCheck);
        }else{
            statusCheck = false;
            System.out.println("A is not less than B with value: "+statusCheck);
        }
    }
}
