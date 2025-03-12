package challenge6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class calculator {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        ExecutorService service = Executors.newFixedThreadPool(1);

        factorial fact = new factorial(5);
        factorial fact2 = new factorial(4);
        factorial fact3 = new factorial(3);


        Future<Integer> result = service.submit(fact);
        Future<Integer> result2 = service.submit(fact2);
        Future<Integer> result3 = service.submit(fact3);

        System.out.println("\nFactorial of your number is: "+result.get());
        System.out.println("\nFactorial of your number is: "+result2.get());
        System.out.println("\nFactorial of your number is: "+result3.get());

        service.shutdown();
    }
}
