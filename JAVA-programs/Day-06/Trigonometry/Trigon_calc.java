package Trigonometry;

interface Trigon 
{
   public double getSine();
   public double getCosine();
}


public class Trigon_calc implements Trigon 
{
    public double getSine()
    {
       return Math.sin(Math.toRadians(60));
    }
    
    public double getCosine()
    {
        return Math.cos(Math.toRadians(60));
    }


}
