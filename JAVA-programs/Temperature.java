import java.util.Scanner;
public class Temperature {
    static void faren(float f)
    {
        System.out.println("The temperature in Celcius is:"+(5*((f-32)/9)));
    }
    public static void main(String []args)
    {   System.out.println("Temperature Conversion");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature in Farenheit:");
        float f = sc.nextFloat();
        faren(f);
    }
    
}

