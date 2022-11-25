public class ThreadRunWithStartRun extends Thread{

    public void run ()
    {
        for (int i = 0; i <= 50; i++)
        {
            System.out.println ("Run: " + i);
        }
    }
    public static void main (String[]args)
    {
        ThreadRunWithStartRun mt = new ThreadRunWithStartRun();
        mt.start ();
        mt.run ();
        for (int i = 0; i <= 50; i++)
        {
            System.out.println ("Main: " + i);
        }
    }

}
