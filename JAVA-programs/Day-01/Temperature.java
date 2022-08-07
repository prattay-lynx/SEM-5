/*Question:-> To take temperature input in fahrenheit
and print the corresponding temperature in celsius 

C:\Users\tapas\Music\Semester-5\SEM-5\JAVA-programs\Day-01>javac Temperature.java
C:\Users\tapas\Music\Semester-5\SEM-5\JAVA-programs\Day-01>java Temperature    
*/



import java.util.Scanner;
public class Temperature {
    static void faren(float f)
    {
        System.out.printf("The temperature in Celcius is:%f *C",(5*((f-32)/9)));
    }
    public static void main(String []args)
    {   System.out.println("Temperature Conversion");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature in Farenheit:");
        float f = sc.nextFloat();
        faren(f);
    }
    
}

/*Output:->
 * Temperature Conversion
Enter the Temperature in Farenheit:
99
The temperature in Celcius is:37.222221 *C
 */
