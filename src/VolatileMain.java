import java.util.logging.Logger;

class VolatileMain {

    /*<<2>>1
            <<1>>0
            <<2>>2
            <<1>>1
            <<2>>3
            <<1>>2
            <<2>>4
            <<1>>3
            <<2>>5
            <<1>>4
            <<2>>6
            <<1>>5
            <<2>>7
            <<1>>6
            <<2>>8
            <<1>>7
            <<2>>9
            <<1>>8
            <<2>>10
            <<1>>9

    Process finished with exit code 0
*/
    private static volatile int counter =0;

    public static void main(String[] args) {



        Thread t1 = new Thread( () -> {

            int localVar = counter;

            while(localVar<10){

                if(localVar!=counter){
                    System.out.println("<<1>>"+localVar);
                    localVar = counter;
                }

            }

        });


        Thread t2 = new Thread( () -> {

            int localVar = counter;

            while(localVar<10) {
                System.out.println("<<2>>"+(localVar+1));
               counter=++localVar;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


            }


        });

        t1.start();
        t2.start();


    }

}
