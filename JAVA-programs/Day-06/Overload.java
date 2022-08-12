/*Question:-> To create a base class and derive two subclasses from that .
 * show that the methods with same name and different type 
 * signatures are not overwritten but overloaded
 */


 /*Output:->
  * The values of a and b and c are:66 4 3
I   I have no values to recieve!!
    The values a and b are:66 4
  */


class Base{
void show(int a ,int b)
{
    System.out.println("The values a and b are:"+a+" "+b);
}
}
class SubClass1 extends Base{
    void show(int a,int b,int c)
    {
        System.out.println("The values of a and b and c are:"+a+" "+b+" "+c);
    }
}
class SubClass2 extends Base{
    void show()
    {
        System.out.println("I have no values to recieve!!");
    }
}

public class Overload {
    public static void main(String args[])
    {
        Base ob = new Base();
        SubClass1 ob1 = new SubClass1();
        SubClass2 ob2 = new SubClass2();
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        ob1.show(a,b,c);
        ob2.show();
        ob.show(a,b);
    }
    
}
