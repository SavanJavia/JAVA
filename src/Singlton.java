import java.util.Date;

public class Singlton {

    private static Singlton obj;

    private Singlton() {
        System.out.println("Construtor Calling..");
    }

    //synchronized
    public static Singlton getInstance(){
       if (obj == null) {
        synchronized(Singlton.class) {
            if (obj == null) {
                obj = new Singlton();
                System.out.println(Thread.currentThread().getName());
           }
        }}

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
