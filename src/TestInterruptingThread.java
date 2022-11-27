public class TestInterruptingThread extends Thread{
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("task");
        }catch(InterruptedException e){
            System.out.println("Exception handled "+e);
            // throw new RuntimeException("Thread interrupted..."+e);
        }
        System.out.println("thread is running...");
    }

    public static void main(String args[]){
        TestInterruptingThread t1=new TestInterruptingThread();
        t1.start();
       // try{
            t1.interrupt();
       // }catch(Exception e){System.out.println("Exception handled "+e);}

    }
}