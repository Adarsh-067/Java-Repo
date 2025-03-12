package in.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to java world!");

        Queue<String> q = new LinkedList<>();
        q.add("chaubey");
        q.add("Adarsh");
        q.offer("Ansh");

        System.out.println(q.peek());
        q.remove("Adarsh");
        q.poll();
        System.out.println(q.contains("Adarsh"));
        System.out.println(q.contains("chaubey"));
        System.out.println(q.isEmpty());
        System.out.println(q.element());
    }
}
