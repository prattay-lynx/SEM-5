import Algebra.*;
import Trigonometry.*;
/*
 * Output:->
The addition is: (9)+i(14)
The subtraction is: (-1)+i(2)
The result of (sin60)^2 + (cos60)^2: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        ComplexNumber com1 = new ComplexNumber(4,8);
        ComplexNumber com2 = new ComplexNumber(5,6);

        com1.add(com1,com2);
        com1.subtract(com1,com2);
        
        double sin60 = new Trigon_calc().getSine();
        double cos60 = new Trigon_calc().getCosine();

        System.out.println("The result of (sin60)^2 + (cos60)^2: "+ (Math.pow(sin60,2.0) + Math.pow(cos60,2.0)));
    }
    
}
