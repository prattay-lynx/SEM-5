import java.util.Scanner;

class Box
{  
        float breadth;
        float height;
        float length;
    Box()
    {
        breadth = 13.0f;
        height = 19.0f;
        length = 10.0f;
    }
    Box(float b , float h, float l)
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

public class SetBoxCon {
    public static void main(String []pars) {
        Scanner sc = new Scanner(System.in);
        float b = 15.0f;
        float h = 13.0f;
        float l = 12.0f;
        Box b1 = new Box(b,h,l);
        
        float vol1 = b1.volume();
        System.out.printf("\nThe volume of cuboid is:%f\n",vol1);
        Box b2 = new Box();
        float vol2 = b2.volume();
        System.out.printf("\nThe volume of cuboid is:%f\n",vol2);

        
    }
}
