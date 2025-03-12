package challenge4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executor {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        ExecutorService service = Executors.newSingleThreadExecutor();
        printNum num = new printNum();
        service.submit(num);

        service.shutdown();
    }
}
