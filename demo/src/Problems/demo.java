package Problems;

import static java.lang.System.currentTimeMillis;

public class demo {
    public static void main(String[] args) {
        long startTime = currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.print("Hello :) ");
        }
        long endTime = currentTimeMillis();

        System.out.print("\nProcess Time is: " + (endTime - startTime) + "ms");
    }

}
