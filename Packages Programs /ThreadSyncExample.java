import java.lang.*;

class Counter {
    private int count = 0;

    // Synchronized method to avoid race condition
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class Worker extends Thread {
    Counter counter;

    Worker(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
public class ThreadSyncExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Worker t1 = new Worker(counter);
        Worker t2 = new Worker(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Counter Value: " + counter.getCount());
    }
}
