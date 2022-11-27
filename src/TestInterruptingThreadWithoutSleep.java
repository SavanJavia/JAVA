public class TestInterruptingThreadWithoutSleep extends Thread{

    /*If any thread is in sleeping or waiting state (i.e. sleep() or wait() is invoked),
    calling the interrupt() method on the thread, breaks out the sleeping or waiting state throwing InterruptedException.
    If the thread is not in the sleeping or waiting state,
    calling the interrupt() method performs normal behaviour and
    doesn't interrupt the thread but sets the interrupt flag to true.*/

    public void run(){
        for(int i=1;i<=5;i++)
            System.out.println(i);
    }

    public static void main(String args[]){
        TestInterruptingThreadWithoutSleep t1=new TestInterruptingThreadWithoutSleep();
        t1.start();
        System.out.println("FLAG>"+t1.isInterrupted());
        t1.interrupt();
        System.out.println("FLAG>"+t1.isInterrupted());

        /*if thread is not in sleeping or waiting state,
                calling the interrupt() method sets the interrupted flag to true
        that can be used to stop the thread by the java programmer later.*/

    }
}
