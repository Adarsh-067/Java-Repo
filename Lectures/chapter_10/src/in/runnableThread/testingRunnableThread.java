package in.runnableThread;

public class testingRunnableThread {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        printRunnable p1 = new printRunnable('@');
        Thread t1 = new Thread(p1);
        t1.start();

        printRunnable p2 = new printRunnable('@');
        Thread t2 = new Thread(p2);
        t2.start();

        printRunnable p3 = new printRunnable('$');
        new Thread(p3).start();

        System.out.println(Thread.currentThread().getName());
    }
}
