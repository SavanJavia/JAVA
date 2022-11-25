public class ThreadRunWithOverrideStart extends Thread{

    public void run ()
    {
        System.out.println ("run");
    }

    public void start ()
    {
        System.out.println ("start");
    }

    public static void main(String[] args) {
        ThreadRunWithOverrideStart t = new ThreadRunWithOverrideStart();
        t.start();
        t.run();
    }

}
