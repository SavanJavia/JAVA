public class ThreadExample1 {

    public static void main(String[] args) {

        RunnableEx1 rx1 = new RunnableEx1();

        Thread t  = new Thread(rx1);
        t.setName("rx1");
        t.start();

    }
}

class RunnableEx1 extends Thread{

    /*  Without synchronized it's throw IllegalMonitorStateException
        The synchronized keyword is used for exclusive accessing.
        wait() instructs the calling thread to shut down the monitor and
        sleep until another thread enters the monitor and calls notify().
        notify() wakes up the first thread that called wait() on the same object. */

    public synchronized void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            System.out.println("2");
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
