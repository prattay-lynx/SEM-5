package Algebra;

interface Complex 
{
   public void add(ComplexNumber ob1,ComplexNumber ob2);
   public void subtract(ComplexNumber ob1,ComplexNumber ob2);
  
}


public class ComplexNumber implements Complex 
{  

    private int real;
    private int im;

    public ComplexNumber(int real,int im)
    {
        this.real = real;
        this.im = im;
    }

    public String toString(int realsum,int imsum)
    {
        return  "(" + realsum +  ")" + "+i" + "(" + imsum + ")";
    }

    public void add(ComplexNumber ob1,ComplexNumber ob2)
    {
       int realsum = ob1.real + ob2.real;
       int imsum = ob1.im + ob2.im;
       System.out.println("The addition is: " + toString(realsum,imsum));
       
    }

    public void subtract(ComplexNumber ob1,ComplexNumber ob2)
    {
       int realsum = ob1.real - ob2.real;
       int imsum = ob1.im - ob2.im;
       System.out.println("The subtraction is: "+ toString(realsum,imsum));
       
    }

}
