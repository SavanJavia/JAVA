package Thread;

public class ClassLevelLock {
    public static void main(String[] args) {

        Base b = new Base();
        Base b1 = new Base();
        ThreadClass t = new ThreadClass(b);
        ThreadClass t1 = new ThreadClass(b1);
        t.start();
        t1.start();
    }
}

class Base{
    public static synchronized void m1() throws InterruptedException {
        for(int i =0;i<5;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}


class ThreadClass extends Thread{
    Base b;

    public ThreadClass(Base b) {
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
