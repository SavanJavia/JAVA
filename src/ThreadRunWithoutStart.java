public class ThreadRunWithoutStart extends Thread{
    public void run ()
    {
        for (int i = 0; i <= 50; i++)
        {
            System.out.println ("Run: " + i);
        }
    }
    public static void main (String[]args)
    {
        ThreadRunWithoutStart mt = new ThreadRunWithoutStart ();
        mt.run ();
        for (int i = 0; i <= 50; i++)
        {
            System.out.println ("Main: " + i);
        }
    }
}
