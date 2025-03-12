package challenge6;

import java.util.concurrent.Callable;

public class factorial implements Callable<Integer> {

    private final int number;;

    factorial(int number){
        this.number = number;
    }
    @Override
    public Integer call() throws Exception {
        System.out.printf("\nGetting factorial of %d....",number);
        Thread.sleep(4000);
        int result = 1;
        for (int i = 1; i <= number ; i++) {
            result *= i;
        }
        return result;
    }
}
