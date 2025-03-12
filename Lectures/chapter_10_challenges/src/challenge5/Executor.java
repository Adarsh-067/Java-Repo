package challenge5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Executor {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            printTask task = new printTask((char) i);
            service.submit(task);
        }

        service.shutdown();
        if (!service.awaitTermination(8, TimeUnit.SECONDS)){
            System.out.println("\nEMERGENCY SHUTDOWN");
            service.shutdownNow();
        }
    }
}
