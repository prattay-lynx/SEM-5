//Output:->
/*[Hello]
[Block]
[Synchronized] */
class Caller {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Interrupted!!");
        }
        System.out.println("]");
    }
}

class Callme implements Runnable {
    String msg;
    Caller target;
    Thread t;

    public Callme(Caller ta, String msg) {
        this.msg = msg;
        target = ta;
        t = new Thread(this);
    }

    public void run() {
        synchronized (target) { //use of Synchronized block
            target.call(msg);
        }
    }
}

class MThread5 {
    public static void main(String[] args) throws InterruptedException {
        Caller ta = new Caller();
        Callme ob1 = new Callme(ta, "Hello");
        Callme ob2 = new Callme(ta, "Synchronized");
        Callme ob3 = new Callme(ta, "Block");

        ob1.t.start();
        ob2.t.start();
        ob3.t.start();

        ob1.t.join();
        ob2.t.join();
        ob3.t.join();

    }
}