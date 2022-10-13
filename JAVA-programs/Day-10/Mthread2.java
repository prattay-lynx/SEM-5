public class Mthread2 extends Thread {
    
    public void run()
    {
        try
        {
            for(int i = 5; i > 0; i--)
            {
                System.out.println("The child thread "+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("The child thread is interrupted!!");
        }
        finally
        {
            System.out.println("The child thread terminates!!");
        }
    }
}
