package in;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class challenge3 {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        List<Integer> list = Arrays.asList(1,2,1,3,7,8,1,8,9);
        System.out.println(Collections.frequency(list,1));
        System.out.println(Collections.frequency(list,8));
        System.out.println(Collections.frequency(list,9));
    }
}
