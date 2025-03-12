package in.Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to collection library in java!");

        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println( Collections.max(set));
        System.out.println( Collections.min(set));

        System.out.println(set.size());
    }
}
