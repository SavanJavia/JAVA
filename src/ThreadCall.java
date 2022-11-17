public class ThreadCall {

    public static void main(String[] args) throws InterruptedException {

       /* A a = new A();

        Thread t1 = new Thread(a);
        t1.start();
        Thread t2 = new Thread(a);
        t2.start();*/

        AT at = new AT();
        at.m1();
        //at.m1();

        AT at1 = new AT();
        at1.m1();

    }
}

class A implements Runnable {
    public synchronized void m1() throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(5000);
    }

    @Override
    public void run() {
        try {
            m1();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class AT extends Thread {
    public synchronized void m1() throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(5000);
    }
}
