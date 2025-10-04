class Thread3 extends Thread {
    public Thread3(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 44;
        while (i > 0) {
            System.out.println("Thank you " + this.getName() + " (ID: " + this.getId() + ")");
            i--;  // decrement, otherwise infinite loop
        }
    }
}

public class ThreadPreority {
    public static void main(String[] args) {
        Thread3 t1 = new Thread3("Aamod");
        Thread3 t2 = new Thread3("Lucky");
        Thread3 t3 = new Thread3("Daniel");
        Thread3 t4 = new Thread3("Honey");

        // setting priority (higher priority may get more CPU time, but not guaranteed)
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);

        // starting threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
