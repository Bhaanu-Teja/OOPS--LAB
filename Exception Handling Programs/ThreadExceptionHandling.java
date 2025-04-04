class MyThread extends Thread {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " running.");
            int result = 10 / 0; // Exception
        } catch (ArithmeticException e) {
            System.out.println("Exception in Thread: " + Thread.currentThread().getName() + " -> " + e.getMessage());
        }
    }
}

public class ThreadExceptionHandling {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}
