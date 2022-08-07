/*Question:->
Create a  class Point for storing coordinates of geometrical points
Write static method to calculate distance between 2 points
 */

 /*Output:->
 WELCOME TO COORDINATE EXPLORER!
Enter the coordinates x and y of first point:
5 6
Enter the coordinates x and y of second point:
4 9
The distance between the point 1 and point 2 are:3.16
 */


import java.util.*;
class Point
{    
    double x,y;  //instance variables
 
    static double CMeasurer(Point ob1,Point ob2)
     {
         System.out.print("The distance between the point 1 and point 2 are:");
         double c1 = (ob1.x - ob2.x);
         double c2 = (ob1.y - ob2.y);
         double d = Math.sqrt(Math.pow(c1,2.0) + Math.pow(c2,2.0));
         return d;
     }
}
public class Coordinates {
    public static void main(String args[])
    {
        System.out.println("WELCOME TO COORDINATE EXPLORER!");
        System.out.println("Enter the coordinates x and y of first point:");
        Point ob1 = new Point();
        Point ob2 = new Point();
        Scanner sc = new Scanner(System.in);
        ob1.x = sc.nextDouble();
        ob1.y = sc.nextDouble();
        System.out.println("Enter the coordinates x and y of second point:");
        ob2.x = sc.nextDouble();
        ob2.y = sc.nextDouble();
        double d = Point.CMeasurer(ob1,ob2);
        System.out.printf("%,.2f",d);
    }
    
}
