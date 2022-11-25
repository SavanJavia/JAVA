public class ThreadExample {

    public static void main(String[] args) {

        RunnableEx rx = new RunnableEx();

        Thread t = new Thread(rx);
        t.setName("0T0");
        t.start();

        Thread t1 = new Thread(rx);
        t1.setName("1T1");
        t1.start();
    }
}

class RunnableEx implements Runnable{

    /*BEFORE THREAD >Thread-0
    BEFORE THREAD >Thread-1
    AFTER THREAD > Thread-0
    AFTER THREAD > Thread-1*/
    @Override
    public synchronized void run() {
        try {
            System.out.println("BEFORE SLEEP > "+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("AFTER SLEEP > "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
