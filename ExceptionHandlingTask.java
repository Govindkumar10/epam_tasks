import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * 
 * @author Govind Kumar
 *
 */

public class ExceptionHanldingTask {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        try{
            try{
                int integer_one = new Integer(sc.nextInt());
                int integer_two = new Integer(sc.nextInt());
                System.out.println("" + (integer_one / integer_two));
            }catch (InputMismatchException exception){
                System.out.println("java.util.InputMismatchException");
             }
            
            }catch(Exception exception){
                System.out.println(exception);
            }
        
    }
}
