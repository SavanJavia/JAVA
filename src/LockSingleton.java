import java.util.concurrent.locks.ReentrantLock;

public class LockSingleton {


    private static LockSingleton obj;

    private LockSingleton() {
        System.out.println("Construtor Calling..");
    }

    //synchronized
    public static LockSingleton getInstance(){
        ReentrantLock lock = new ReentrantLock();
        // if (obj == null) {
       try {
           lock.lock();
            if (obj == null) {
                obj = new LockSingleton();
                System.out.println(Thread.currentThread().getName());
 // }
            }
       }
       finally {
           lock.unlock();
       }

        return obj;
    }


    public static void main(String[] args) {
        long startTime = System.nanoTime();

        Thread t1 = new Thread() {

            @Override
            public void run() {

                System.out.println(getInstance());
            }

        };

        Thread t2 = new Thread() {

            @Override
            public void run() {

                System.out.println(getInstance());
            }

        };

        t1.start();
        t2.start();

        long endTime = System.nanoTime() - startTime;
        System.out.println("TIME.."+endTime);
    }
}
