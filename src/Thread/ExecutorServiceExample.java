package Thread;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

public class ExecutorServiceExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Set<Callable<String>> callables = new HashSet<Callable<String>>();

        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 1";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 2";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 3";
            }
        });

        java.util.List<Future<String>> futures = executorService.invokeAll(callables);

        for(Future<String> future : futures){
            System.out.println("future.get = " + future.get());
        }

        executorService.shutdown();

        System.out.println(System.currentTimeMillis()-start);
        System.out.println("----------------------------------------");
        long start1 = System.currentTimeMillis();

        ExecutorService executorService1 = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        Set<Callable<String>> callables1 = new HashSet<Callable<String>>();

        callables1.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 1";
            }
        });
        callables1.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 2";
            }
        });
        callables1.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 3";
            }
        });

        java.util.List<Future<String>> futures1 = executorService1.invokeAll(callables1);

        for(Future<String> future1 : futures1){
            System.out.println("future.get = " + future1.get());
        }

        executorService1.shutdown();

        System.out.println(System.currentTimeMillis()-start1);

    }
}
