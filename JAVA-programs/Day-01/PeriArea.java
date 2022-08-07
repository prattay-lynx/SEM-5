/*Question:->->To take input of 3 sides of triangle
calculate their perimeter and area
C:\Users\tapas\Music\Semester-5\SEM-5\JAVA-programs\Day-01>javac PeriArea.java
C:\Users\tapas\Music\Semester-5\SEM-5\JAVA-programs\Day-01>java PeriArea 

//some points:-
//no need to include any library for Math.sqrt(int) */


import java.util.Scanner;
public class PeriArea {
    void perimeter(int a,int b,int c)
    {
        System.out.println("The perimeter is:"+(a+b+c));
    }
    void area(int a ,int b,int c)
    {   int s = (a+b+c)/2;
        System.out.printf("The area is %d", (int)Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of a triangle:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        PeriArea ob = new PeriArea();
        ob.perimeter(a,b,c);
        ob.area(a,b,c);
    }
    
}
/*Output:->
Enter the three sides of a triangle:
5 6 8
The perimeter is:19
The area is 10
 */
