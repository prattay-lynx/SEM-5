/*Question:->
 * WAP in java to implement exception handling using try-catch block. 
 * The code that will be written inside the try block should throw atleast 
 * 3 different exception that should be for individual catch block
 */

 /*Output:->
java.lang.ArithmeticException: / by zero
        
java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
        
java.lang.NumberFormatException: For input string: "five"
        
*/
import java.io.*;

public class Exception1{

    public static void dByZ(int r) 
    {
        int c = 5;
        System.out.println("The value of a is: "+ (c/r));
    }
    public static void array(int c[])
    {
        c[6]=42;
        return;
    }

    public static void main(String[] args) throws IOException
    {
    try {

        try
        {
            int r = 0;
            dByZ(r);
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
        try
        {
            int a[]=new int[5];
               array(a);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        try
        {
            int num = Integer.parseInt("five");
            System.out.println(num);
        }
        catch(NumberFormatException e)
        {
            e.printStackTrace();
        }
    }
        catch(Exception e)
        {
            System.out.println("Exception handled!!");
        }
        
    }
    
}
