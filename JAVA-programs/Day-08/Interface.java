/*
 * Output:_>
I've called the method defined inside an interface
The sum is: 22
 */

class PI2 
{
    interface IN1
    {
        interface IN2
        {
            public void interMethod();
            public int sum_Calc();
        }
    }
}

class Sol implements PI2.IN1.IN2
{ 

    private int a = 12;
    private int b = 10;
  public void interMethod()
  {
     System.out.println("I've called the method defined inside an interface");
  }
  
  public int sum_Calc()
  {
    int sum = a + b;
    return sum;
  }
  
       
}
public class Interface
{
     public static void main(String args[])
     {
         PI2.IN1.IN2 obj;
         Sol b = new Sol();
        obj = b;
        obj.interMethod();
        System.out.println("The sum is: "+ obj.sum_Calc());
     }
}