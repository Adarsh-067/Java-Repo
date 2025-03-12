package in.Executor;

import in.runnableThread.printRunnable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class singleThreadExecutor {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

       ExecutorService service = Executors.newSingleThreadExecutor();
        printRunnable task = new printRunnable('*');
        printRunnable task2 = new printRunnable('+');
        printRunnable task3 = new printRunnable('-');

       long startTime = System.currentTimeMillis();

        service.submit(task);
        service.submit(task2);
        service.submit(task3);

       service.shutdown();

        long endTime = System.currentTimeMillis();
        System.out.println("\ntime is: " + (endTime - startTime));
    }
}
