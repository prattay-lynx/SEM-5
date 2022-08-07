/*Question->
 * Parameterized Constructor and default constructor implementation
 * by performing method calls
 */

 /*Output:->
  
C:\Users\tapas\Music\Semester-5\SEM-5\JAVA-programs\Day-03>javac Calc.java          
C:\Users\tapas\Music\Semester-5\SEM-5\JAVA-programs\Day-03>java Calc 4 6 2         
Non parameterized constructor called 
Parameterized constructor called 4
First function called
Second function called 6
Second function called 2.0 */

class Hello
{
int a;
Hello()
{
System.out.println("Non parameterized constructor called ");
}
Hello(int a)
{
System.out.println("Parameterized constructor called "+a);
}
void f()
{
System.out.println("First function called");
}
void f(int d)
{
System.out.println("Second function called "+d+"");
}
void f(double a)
{
System.out.println("Second function called "+a+"");
}
}
class Calc
{
public static void main(String args[])
{
Hello a=new Hello();
Hello b=new Hello(Integer.parseInt(args[0]));
b.f();
b.f(Integer.parseInt(args[1]));
b.f(Double.parseDouble(args[2]));
}
}
