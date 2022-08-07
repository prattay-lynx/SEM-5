/*Question:->
 Create a class Complex for storing real and imaginary parts of Complex Number
 The class should have static members to store number of complex numbers created and display it
 Write static or non static method as required to calculate:-
 1 The sum difference and product of 2 complex numbers
 2 Modulus and complement of Complex Number
 Define required constructors of the class
 */
/*Output:_.
 * welcome to complex game:
Enter the 1st complex number's real and imaginary part:
5 4
Enter the 2nd complex number's real and imaginary part:
3 2
Enter the choice
1.Add
2.Difference
3.Product
4.Modulus
5.complement
6.exit
1
You have selected addition:
The complex number is :8+i6
Enter the choice
1.Add
2.Difference
3.Product
4.Modulus
5.complement
6.exit
4
You have selected modulus:
The modulus is :2.8284271247461903
Enter the choice
1.Add
2.Difference
3.Product
4.Modulus
5.complement
6.exit
6
 */
import java.util.*;
class Complex
{
     int real;
     int im;
     

     public void add(Complex c1,Complex c2)
     {  
        int r = c1.real + c2.real;
        int i = c1.im + c2.im;
        show(r,i); 
     }
     public void sub(Complex c1,Complex c2)
     {  
        int r = c1.real - c2.real;
        int i = c1.im - c2.im;
        show(r,i); 
     }

     public void prod(Complex c1,Complex c2)
     {  
        int r = c1.real * c2.real;
        int i = c1.im * c2.im;
        show(r,i); 
     }

     public void mod(Complex c1,Complex c2)
     {  
        int r = c1.real - c2.real;
        int i = c1.im - c2.im;
        System.out.println("The modulus is :"+Math.sqrt(Math.pow(r,2) + Math.pow(i,2)));
        
     }
     public void com(Complex c1)
     {  
        
        System.out.println("The complex number is :"+ c1.real + "-i"+ c1.im);
        
     }
     public void show(int r, int i)
     {
        System.out.println("The complex number is :"+ r + "+i"+ i);
     }

}


public class ComplexNumber {

 public static void main(String args [])
 {    Scanner sc = new Scanner(System.in);
      Complex c1 = new Complex();
      Complex c2 = new Complex();
      System.out.println("welcome to complex game:");
      System.out.println("Enter the 1st complex number's real and imaginary part:");
      c1.real = sc.nextInt();
      c1.im = sc.nextInt();
      System.out.println("Enter the 2nd complex number's real and imaginary part:");
      c2.real = sc.nextInt();
      c2.im = sc.nextInt();
    while(true){
      System.out.println("Enter the choice\n1.Add\n2.Difference\n3.Product\n4.Modulus\n5.complement\n6.exit");
      int choice = sc.nextInt();
      Complex co = new Complex();
    
      switch(choice)
      {   
        case 1 : System.out.println("You have selected addition:");
                 co.add(c1,c2);
                 break;
        case 2 : System.out.println("You have selected subtraction:");
                 co.sub(c1,c2);
                 break;
        case 3 : System.out.println("You have selected Product:");
                 co.prod(c1,c2);
                 break;
        case 4 :System.out.println("You have selected modulus:");
                 co.mod(c1,c2);
                 break;
        case 5 :System.out.println("You have selected Complement:");
                 co.com(c1);
                 break;
        case 6 :System.exit(0);
        default : System.out.println("Wrong option");
                  System.exit(0);
}}
 }
}
