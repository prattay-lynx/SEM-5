import Algebra.*;
import Trigonometry.*;
/*
 * Output :->
The addition is: (9) +i(14)
The subtraction is: (-1) +i(-2)
The value of (sin60)^2 + (cos60)^2 : 1.0
 */
public class Demo
{
    public static void main(String[] args) 
    {   

        ComplexNumber com1 = new ComplexNumber();
        ComplexNumber com2 = new ComplexNumber();
        com1.setValue(4,6);
        com2.setValue(5,8);

        new ComplexNumber().add(com1,com2);
        new ComplexNumber().subtract(com1,com2);
        
        double sin60 = new Trigon_calc().getSine();
        double cos60 = new Trigon_calc().getCosine();
        System.out.println("The value of (sin60)^2 + (cos60)^2 : " + (Math.pow(sin60,2.0)+Math.pow(cos60,2.0)));

    }
}

