/*
Question:>
WAP in java to display this system  defined information regarding the main thread .
Change the default value of the main thread to MyThread and define some activity for the thread.

 * Output:->
The main thread: Thread[main,5,main]
The main thread after name change:Thread[MyThread,5,main]
The main thread: 1
The main thread: 2
The main thread: 3
The main thread: 4
The main thread: 5
 */
public class MThhread3 extends Thread {
    public static void main(String[] args) {
        Thread th = new Thread();
        Thread t = Thread.currentThread();
        System.out.println("The main thread: "+t);
        th.setName("MyThread");
        System.out.println("The main thread after name change:"+th);

        try{
            for(int i = 1; i <= 5; i++)
            {
                System.out.println("The main thread: "+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main Thread interrupted!!");
        }
    }
}
