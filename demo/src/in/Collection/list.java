package in.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to collection library in java!");

        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(30);

        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("size is: " + list.size());

        Collections.sort(list);

        list.removeFirst();
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println("size is: " + list.size());
        list.removeLast();
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println("size is: " + list.size());
        System.out.println(list.get(1));
        /*for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println("size is: " + list.size());*/

        System.out.println(list.contains(30));
        list.set(1,60);

        System.out.println("size is: " + list.size());
        for (Integer i : list) {
            System.out.println(i);
        }

        list.clear();
    }
}
