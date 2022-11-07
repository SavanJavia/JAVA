package ProducerConsumer;

import java.util.UUID;
import java.util.concurrent.BlockingQueue;

public class TokenVendingMachine implements Runnable {

    private BlockingQueue<Token> blockingQueue;

    public TokenVendingMachine(BlockingQueue<Token> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) { //bank serves a maximum of 100 tokens/day
            Token token = new Token();
            token.setId(UUID.randomUUID());
            token.setNumber(i);
            token.setDescription("Some Description");
            /**
             * Insert the token element in the Queue. Wait if no space is
             * available
             */
            try {
                System.out.println("New token issued :" + token);
                blockingQueue.put(token);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
