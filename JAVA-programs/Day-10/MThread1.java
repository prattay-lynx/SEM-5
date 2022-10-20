/*
 *Output:->
The child thread : Thread[One,5,main]
The child thread : Thread[Two,5,main]
The main thread : Thread[main,5,main]
Two:5
One:5
The main thread 5
Two:4
One:4
The main thread 4
Two:3
One:3
Two:2
One:2
The main thread 3
Two:1
One:1
The child thread terminates!!
The child thread terminates!!
The main thread 2
The main thread 1
The main thread terminates!!!
 */
public class MThread1 implements Runnable
{
   String name;
   Thread t;
   public MThread1(String threadname)
   {
     name = threadname;
     t = new Thread(this,name);
     System.out.println("The child thread : "+t);
   }
   public void run()
   {
     try
     { 
       for(int i = 5; i > 0; i--)
       {
          System.out.println(name+":"+i);
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
         MThread1 t1 = new MThread1("One");
         MThread1 t2 = new MThread1("Two");
         
         t1.t.start();
         t2.t.start();

         Thread t3=Thread.currentThread();

         try
         {
            System.out.println("The main thread : "+ t3);
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