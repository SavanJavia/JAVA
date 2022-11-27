import java.util.concurrent.atomic.AtomicInteger;

public class SyncVolatileItomicClass implements Runnable{

    public static volatile int z = 0;

    AtomicInteger count = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {

        SyncVolatileItomicClass obj =new SyncVolatileItomicClass();

        Thread t = new Thread(obj);
        t.start();

        Thread t1 = new Thread(obj);
        t1.start();

        t.join();
        t1.join();

        System.out.println(obj.getCount());
    }

    @Override
    //public synchronized void run() {
    public void run() {
        for (int i=0;i<5;i++){
            try {
                Thread.sleep(i*100);
               // z++;
                count.getAndIncrement();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public AtomicInteger getCount(){

        return count;
    }




}
