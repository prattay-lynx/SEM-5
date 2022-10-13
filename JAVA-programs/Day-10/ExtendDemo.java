
public class ExtendDemo
{
    public static void main(String[] args) {
        new Mthread2().start();
        System.out.println("THe current thread: "+Thread.currentThread().getName());
        try{
            for(int i = 5; i > 0; i--)
            {
                System.out.println("The main thread "+i);
                Thread.sleep(800);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("The main thread is interrupted!!");
        }
        finally
        {
            System.out.println("The main thread terminates!!");
        }
    }
}
