package Thread;

public class MethodLevelLock {
    public static void main(String[] args) {

        Base1 b = new Base1();

        ThreadClass1 t = new ThreadClass1(b);
        ThreadClass1 t1 = new ThreadClass1(b);

        t.start();
        t1.start();
    }
}

class Base1{
    public synchronized void m1() throws InterruptedException {
        for(int i =0;i<5;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}


class ThreadClass1 extends Thread{
    Base1 b;

    public ThreadClass1(Base1 b) {
        this.b = b;
    }

    @Override
    public void run() {
        try {
            b.m1();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
