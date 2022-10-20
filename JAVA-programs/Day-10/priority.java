/*Output:->
 * High priority thread: 30849313
Low priority thread: 30424442
 */

class countvalues implements Runnable {
    long count = 0;
    Thread t;
    private volatile boolean running = true;

    public countvalues(int p) {
        t = new Thread(this);
        t.setPriority(p);
    }

    public void run() {
        while (running) {
            count++;
        }
    }

    public void stop() {
        running = false;
    }

    public void start() {
        t.start();
    }
}

public class priority {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        countvalues hi = new countvalues(Thread.NORM_PRIORITY + 2);
        countvalues low = new countvalues(Thread.NORM_PRIORITY - 2);
        low.start();
        hi.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        low.stop();
        hi.stop();
        try {
            hi.t.join();
            low.t.join();
        } catch (InterruptedException e) 
        {
            System.out.println("Exiting main thread");
        }
        System.out.println("High priority thread: " + hi.count);
        System.out.println("Low priority thread: " + low.count);
    }
}