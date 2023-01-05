package Core_Java;

public class SingletonPattern {

    private static SingletonPattern obj;

    private SingletonPattern() {
        System.out.println("Construtor Calling..");
    }

    //synchronized
    public static SingletonPattern getInstance(){
       if (obj == null) {
        synchronized(SingletonPattern.class) {
            if (obj == null) {
                obj = new SingletonPattern();
                System.out.println(Thread.currentThread().getName());
           }
        }
       }
     return obj;
    }


    public static void main(String[] args) {
        long startTime = System.nanoTime();

        Thread t1 = new Thread(() -> System.out.println(getInstance()));
        Thread t2 = new Thread(() -> System.out.println(getInstance()));

        t1.start();
        t2.start();

        long endTime = System.nanoTime() - startTime;
        System.out.println("TIME.."+endTime);
    }

}
