import java.util.Scanner;

class Box
{  
        float breadth;
        float height;
        float length;
    void setData(float b , float h, float l)
    {
        breadth = b;
        height = h;
        length = l;
    }

    float volume()
    {
        return breadth*height*length;
    }
}


public class SetBox 
{
    public static void main(String []args)
    {
        Box b1 = new Box();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the breadth , height and length of cuboid:");
        float b = sc.nextFloat();
        float h = sc.nextFloat();
        float l = sc.nextFloat();
        b1.setData(b,h,l);
        float vol1 = b1.volume();
        System.out.printf("\nThe volume of cuboid is:%f\n",vol1);

        Box b2 = new Box();
        System.out.println("Enter the dimension of the cube:");
        float x = sc.nextFloat();
        b=h=l=x;
        b2.setData(b,h,l);
        float vol2 = b2.volume();
        System.out.printf("\nThe volume of cube is:%f\n",vol2);
        if(vol1 > vol2)
        {
            System.out.println("The cuboid volume > Cube volume");
        }
        else{
            System.out.println("The cuboid volume < Cube volume");
        }
        
    }
}
