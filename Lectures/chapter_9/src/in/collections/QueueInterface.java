package in.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        Queue<Object> q = new LinkedList<>();

        q.add(1);
        q.offer(2);

        for (Object o : q) {
            System.out.println(o);
        }

        System.out.println( q.element());
        System.out.println(q.peek());

        q.remove(1);
        q.remove(2);

        for (Object o : q) {
            System.out.println(o);
        }

        System.out.println(q.poll());
        System.out.println(q.remove());
    }
}
