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
