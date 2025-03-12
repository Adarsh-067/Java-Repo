package in.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class multiThreadExecutor {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            printRunnable task = new printRunnable((char)i);
            service.submit(task);
        }

       /* printRunnable task1 = new printRunnable('#');
        printRunnable task2 = new printRunnable('$');
        printRunnable task3 = new printRunnable('&');
        printRunnable task4 = new printRunnable('+');
        printRunnable task5 = new printRunnable('*');*/

        service.shutdown();
        System.out.println("**************1");
        if (!service.awaitTermination(10, TimeUnit.SECONDS)){
            System.out.println("\n*************2");
            service.shutdownNow();
        }
    }
}
