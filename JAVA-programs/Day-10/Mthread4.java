
/*Output:->
 * New Thread: Thread[One,5,main]
New Thread: Thread[Two,5,main]
Thread one is Alive :true
Thread one is Alive :true
One:5
Two:5
One:4
Two:4
Two:3
One:3
One:2
Two:2
Two:1
One:1
Two:0
One:0
Main thread: 5
Main thread: 4
Main thread: 3
Main thread: 2
Main thread: 1
Main thread: 0
 */

class Test extends Thread
{ 
   String thname; Thread t;
   public Test(String name) 
   {
     thname = name;
     t = new Thread(this,thname);
     System.out.println("New Thread: "+t);
   }
   public void run()
   {
    try{
        for(int i = 5; i >=0; i--)
        {
            System.out.println(thname+":"+i);
            Thread.sleep(1000);
        }
    }
    catch(InterruptedException e)
    {
        System.out.println("Thread "+thname+" interrupted!!");
    }
   }
}
class Mthread4 
{
    public static void main(String[] args) throws InterruptedException
    {
        Test t1 = new Test("One");
        Test t2 = new Test("Two");

        t1.start();
        t2.start();

        System.out.println("Thread one is Alive :"+t1.isAlive());
        System.out.println("Thread one is Alive :"+t2.isAlive());

        t1.join();
        t2.join();

        try{
            for(int i = 5; i >=0; i--)
            {
                System.out.println("Main thread: "+i);
                Thread.sleep(75);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("The main thread terminated!");
        }
    }
}