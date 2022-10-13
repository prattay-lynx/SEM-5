/*
 * output:->
 * PS C:\Users\tapas\Music\Semester-5\SEM-5\JAVA-programs\Day-10> java MyThread
main
The child thread : Thread[MyThread,5,main]
main
The main thread : Thread[MainThread,5,main]
The child thread: 5
The main thread 5
The child thread: 4
The main thread 4
The child thread: 3
The child thread: 2
The main thread 3
The child thread: 1
The child thread terminates!!
The main thread 2
The main thread 1
The main thread terminates!!!
 */
public class MThread1 implements Runnable
{
   public MThread1()
   {
     Thread th = new Thread(this,"MyThread");
     System.out.println(Thread.currentThread().getName());
     System.out.println("The child thread : "+th);
   }
   public void run()
   {
     try
     { 
       for(int i = 5; i > 0; i--)
       {
          System.out.println("The child thread: "+i);
          Thread.sleep(500);
       }   
     }
     catch(InterruptedException e)
     {
        System.out.println("child thread interrupted!!");
     }
     finally
     {
        System.out.println("The child thread terminates!!");
     }
   }
}

class MyThread
{
      public static void main(String[] args) 
      {
         MThread1 t = new MThread1();
         Thread th = new  Thread(t);
         th.start();
         try
         {
            th.setName("MainThread");
            System.out.println(Thread.currentThread().getName());
            System.out.println("The main thread : "+th);
            for(int i = 5; i > 0; i--)
            {
                System.out.println("The main thread "+i);
                Thread.sleep(1000);  
                //the last thread to execute is
                //the main thread since sleep time is
                //1000 ms > than child thread 500ms.
            }
         }
         catch(InterruptedException e)
         {
            System.out.println("The main thread is interrupted!");
         }
         finally
         {
            System.out.println("The main thread terminates!!!");
         }
      }
}