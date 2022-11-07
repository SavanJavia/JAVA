package ProducerConsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;

public class TokenServingCounter implements Runnable {

    private BlockingQueue<Token> blockingQueue;
    private CountDownLatch countDownLatch;

    public TokenServingCounter(BlockingQueue<Token> blockingQueue,
                               CountDownLatch countDownLatch) {
        this.blockingQueue = blockingQueue;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        /**
         * Serving token one by one in a infinite loop.
         * The Loop will break while there are no more
         * token to serve
         */
        while (true) {
            if (countDownLatch.getCount() == 0) {
                break;
            }
            try {
                // Serving the customer with the token
                Token token = blockingQueue.take();
                System.out.println("Serving Token :" + token);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
        /*Decrementing count from the Countdown Latch
        as the token is served*/
                countDownLatch.countDown();
            }
        }
    }
}
