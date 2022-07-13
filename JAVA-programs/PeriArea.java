import java.util.Scanner;
public class PeriArea {
    static void perimeter(int a ,int b,int c)
    {
        System.out.println("The perimeter is:"+(a+b+c));
    }
    static void area(int a ,int b,int c)
    {   int s = (a+b+c)/2;
        System.out.println("The area is "+ Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of a triangle:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        perimeter(a,b,c);
        area(a,b,c);
    }
    
}
