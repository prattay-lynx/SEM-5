/*Output:->
High priority thread: 835591946
Low priority thread: 833225100
Priority Difference: 2366846
 */
/*Question no 4 */
class countValues implements Runnable {
    private long count = 0;
    Thread t;
    private volatile boolean running = true;

    public countValues(int p) {
        t = new Thread(this);
        t.setPriority(p);
    }

    public void run() {
        while (running) count++;
    }

    public void stop1() {
        running = false;
    }

    // public void start() {
    //     t.start();
    // }
    public long getCount()
    {
        return count;
    }
}

public class Priority {
    public static void main(String[] args) throws InterruptedException
    {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        countValues hi = new countValues(Thread.NORM_PRIORITY + 2);
        countValues low = new countValues(Thread.NORM_PRIORITY - 2);
        Thread th = new Thread(hi);
        Thread th1 = new Thread(low);

        th.start();
        th1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
       low.stop1();
       hi.stop1();

       hi.t.join();
       low.t.join();

       long h = hi.getCount();
       long l = low.getCount();
        
       System.out.println("High priority thread: " + h);
       System.out.println("Low priority thread: " + l);
       System.out.println("Priority Difference: " + (h-l));
    }
}