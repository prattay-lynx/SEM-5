/* Question:-> To create a base class and then derive 
another class from it which should contain a method with 
same name and type signature as in the base class.Show that the
subclass version of the method overrides the base class 
version when called from, the scope of the subclass 
 */

 /*Output:->
  * C:\Users\C1 11\Vscode>java MainClass 45
The value of i is:45
I'm the subclass !!!!
  */

class Base{
    int i;
    Base(int m)
    {
        this.i = m;
        System.out.println("The value of i is:"+i);
    }
    void callme()
    {
        System.out.println("I'm the base class!!!");
    }
}
class SubClass extends Base{
    SubClass(int a)
    {
        super(a);
    }
    void callme()
    {
        System.out.println("I'm the subclass !!!!");
    }
}

class MainClass
{
    public static void main(String args[])
    {   int a = Integer.parseInt(args[0]);
        SubClass sub = new SubClass(a);
        sub.callme();

    }
}