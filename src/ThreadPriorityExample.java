// Importing the required classes  

import java.lang.*;

public class ThreadPriorityExample extends Thread {
    /*Default priority of a thread is 5 (NORM_PRIORITY). The value of MIN_PRIORITY is 1 and the value of MAX_PRIORITY is 10*/
    public synchronized void run() {
        System.out.println("Inside the run() method>"+Thread.currentThread().getName());
    }

    public static void main(String argvs[]) {

        ThreadPriorityExample th1 = new ThreadPriorityExample();
        th1.setPriority(1);
        th1.setName("1");
        th1.start();

        ThreadPriorityExample th2 = new ThreadPriorityExample();
        th2.setPriority(5);
        th2.setName("5");
        th2.start();

        ThreadPriorityExample th3 = new ThreadPriorityExample();
        th3.setPriority(10);
        th3.setName("10");
        th3.start();



       /* System.out.println("Priority of the thread th1 is : " + th1.getPriority());
        System.out.println("Priority of the thread th2 is : " + th2.getPriority());
        System.out.println("Priority of the thread th2 is : " + th2.getPriority());*/





       /* System.out.println("Priority of the thread th1 is : " + th1.getPriority());
        System.out.println("Priority of the thread th2 is : " + th2.getPriority());
        System.out.println("Priority of the thread th3 is : " + th3.getPriority());

        System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());
        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);
        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());*/


    }
}  