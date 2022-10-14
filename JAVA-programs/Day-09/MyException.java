/*Output:->
Exception generated!!
Thrown an exception!!zz
 */

public class MyException extends Exception {
    public MyException(String s)
    {
        super(s);
    }
    public static void main(String[] args) {
        try
        {
            throw new MyException("Thrown an exception!!");
        }
        catch(MyException e){
            System.out.println("Exception generated!!");
            System.out.println(e.getMessage());
        }
    }
}
