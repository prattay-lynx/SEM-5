/*Question->
 *  Demonstrate Working of Nested Classes
 * both static and non-static
 */

 /*Output;->
The addition is:121
The values of x1 and y1 are:77 88
  */
class OuterClass
{
    static class InClass  //static nested class
    {    
         int a = 55;
         int b = 66;
         int c = 77;
         void display()
         {System.out.println("The addition is:"+(a+b));}
    }

    class NonstaInclass  //non staic class
    {
        int x1 = 77;
        int y1 = 88;
        void display()
        {
            System.out.println("The values of x1 and y1 are:"+x1+" "+y1);
        }

    }
}

public class NestedClass {
    public static void main(String args[])
    {
       OuterClass.InClass nestedobj = new OuterClass.InClass();
       nestedobj.display(); //static nested class
       
       OuterClass outerobj = new OuterClass();
       OuterClass.NonstaInclass innerobj = outerobj.new NonstaInclass();
       innerobj.display(); //non-static nested class
    }
}


