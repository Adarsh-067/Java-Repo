package in.Futures;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class testingFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        ExecutorService service = Executors.newFixedThreadPool(1);

        fetchName task1 = new fetchName("prashant");
        fetchName task2 = new fetchName("rohit");
        fetchName task3 = new fetchName("raghav");
        fetchName task4 = new fetchName("joy");

        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);
        Future<String> name4 = service.submit(task4);

        System.out.printf("\n %s",name1.get());
        System.out.printf("\n %s",name2.get());
        System.out.printf("\n %s",name3.get());
        System.out.printf("\n %s",name4.get());

        service.shutdown();
    }
}
