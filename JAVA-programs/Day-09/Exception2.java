/*Question:->
 * WAP in java to implement exception handling using nested btry block in order to do that code 
 * must throw atleast 2 different exceptions.
 */

 /*Output:->
  * java.lang.ArithmeticException: / by zero
  java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
  */

public class Exception2 {
    public static void main(String[] args)
    {
    try {

        try
        {
            int r = 0;
            System.out.println(5/r);
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
        try
        {
            int a[]=new int[5];
               a[6]=42;
        }
        catch(ArrayIndexOutOfBoundsException e)
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
