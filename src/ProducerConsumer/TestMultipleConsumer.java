package ProducerConsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class TestMultipleConsumer {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Token> blockingQueue = new LinkedBlockingQueue<>();

        /**
         * Create and START the vending Machine. The Machine will create
         * 100 token/day. Which will be served in 5 counters
         */
        TokenVendingMachine tokenVendingMachine = new TokenVendingMachine(blockingQueue);
        new Thread(tokenVendingMachine).start();
        CountDownLatch countDownLatch = new CountDownLatch(100);

        // Here we have the Token consumer. We have 5 counter
        TokenServingCounter tokenConsumer = new TokenServingCounter(blockingQueue,
                countDownLatch);
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 5; i++) {
            executor.submit(tokenConsumer);
        }
        countDownLatch.await();
        System.out.println("Stopped");
        executor.shutdown();
    }
}
