/*output-->
 * Cannot invoke "Exception6.method1()" because "th" is null
Display inspite of null pointer exception!
/ by zero
display inspite of return
 */

public class Exception6 {
 public void method1()
 {
    System.out.println("I'll be printed!!");
 }
 public int Calc()
 {  
    int s = 12/0;
    System.out.println(s);
    return s;
 }
}
class Ex{
 public static void main(String[] args) {
    try{
        Exception6 th = new Exception6();
        th=null;
        th.method1();
    }
    catch(NullPointerException e)
    {
        System.out.println(e.getMessage());
    }
    finally
    {
        System.out.println("Display inspite of null pointer exception!");
    }
    try
    {
      new Exception6().Calc();
    }
    catch(ArithmeticException e)
    {
        System.out.println(e.getMessage());
    }
    finally{
        System.out.println("display inspite of return");
    }
  }
}
