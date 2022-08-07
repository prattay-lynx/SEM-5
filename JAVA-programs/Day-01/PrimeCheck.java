/*Question-> To Check if a number is prime or not
 * C:\Users\tapas\Music\Semester-5\SEM-5\JAVA-programs\Day-01>javac PrimeCheck.java 
   C:\Users\tapas\Music\Semester-5\SEM-5\JAVA-programs\Day-01>java PrimeCheck 13 
 */


public class PrimeCheck {
    public static void main(String []args) {
        int a = Integer.parseInt(args[0]);
        int c = 0;
        for(int i = 2; i <= a; i++)
        {
             if(a % i == 0)
             {
                c++;
             }
        }
        if(c >= 2)
        {
            System.out.println("The number is not prime");
        }
        else{
            System.out.println("The number is prime");
        }
        
    }
    
}

/*Output :->
 * The number is prime
 */