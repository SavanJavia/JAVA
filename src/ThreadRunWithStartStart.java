public class ThreadRunWithStartStart extends Thread{
    public void run ()
    {
        for (int i = 0; i <= 50; i++)
        {
            System.out.println ("Run: " + i);
        }
    }
    public static void main (String[]args)
    {
        ThreadRunWithStartStart mt = new ThreadRunWithStartStart();
        mt.start();
        mt.start();
        for (int i = 0; i <= 50; i++)
        {
            System.out.println ("Main: " + i);
        }
    }
}
