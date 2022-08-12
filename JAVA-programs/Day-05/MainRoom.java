/*Question:->
 * To Create a class called Room with data members(length,breadth,height) and method calc_Area()
   to calculate the area and display it. Derive two subclasses from this class namely Bedroom and 
   DrawingRoom Where Bedroom will have attached bathroom(BR),study table(ST),night lamp(NL)
   and a display method to display all its features.

   Drawing Room will have so far have a wall cabinet and a display() method to display the 
   features.Also display the areas of bedroom and drawing room.
*/

/*Output:-> 
Welcome to the the Room!!
Do you like to have an attached bathroom and astudy table with night lamp?
if YES Enter true else false:
false
true
The features of the bedroom:
Bedroom with no Attached bathroom available!!
Study table with night lamp available!!
Welcome to the bedroom!!
The area of  Bedroom is: 2184.0
The features of the drawing room :
We have got a nice wall cabinet!!!!
The area of Drawing room is: 31944.0
*/


import java.util.Scanner;

class Room {
    double length; double breadth; double height;

    public double calc_Area(double length,double breadth,double height)
    {
        return length*breadth*height;
    }
    
}

class Bedroom extends Room
{   
    double vol;
    boolean br;
    boolean s;
    boolean nl;
    void area()
    { double area1;
      System.out.println("Welcome to the bedroom!!");
      area1 = calc_Area(12.0,13.0,14.0);
      System.out.println("The area of  Bedroom is: " + area1);
    }
    
    Bedroom(boolean br, boolean s)
    {
        this.br= br;
        this.s = s;
        nl = true;
    }

   void display()
   {
       if(br == true)
       {
         System.out.println("Bedroom with Attached bathroom available !!"); 
         
       }
       else
       {
         System.out.println("Bedroom with no Attached bathroom available!!");
       }

       if(s == true && nl == true)
       {
         System.out.println("Study table with night lamp available!!");
       }
       else{
        System.out.println("Study table with night lamp not available!!");
       }
   
   }
   
}
class Drawing extends Room{
    void display()
    {   double area;
        System.out.println("We have got a nice wall cabinet!!!!");
        area = calc_Area(22.0,33.0,44.0);
        System.out.println("The area of Drawing room is: " + area);

    }
}
public class MainRoom{
public static void main(String[] args) 
    {    
        boolean br,s,nl;
         
        System.out.println("Welcome to the the Room!!\nDo you like to have an attached bathroom and a"+
        "study table with night lamp?\nif YES Enter true else false:");
        Scanner sc = new Scanner(System.in);
        
        br = sc.nextBoolean();
        s = sc.nextBoolean();
        System.out.println("The features of the bedroom:");
        Bedroom b = new Bedroom(br,s);
        b.display();
        b.area();
        System.out.println("The features of the drawing room :");
        new Drawing().display();
    }
}