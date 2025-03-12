package in.priorityThread;

public class testingPriorityThread {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Hello, Adarsh welcome to java world!\n");

        PriorityThread p1 = new PriorityThread('*');
        PriorityThread p2 = new PriorityThread('^');
        PriorityThread p3 = new PriorityThread('&');

//        p1.setPriority(Thread.MIN_PRIORITY);
        p1.start();
        p1.join();

//        p2.setPriority(Thread.NORM_PRIORITY);
        p2.start();
        p2.join();
//        p3.setPriority(Thread.MAX_PRIORITY);
        p3.start();


        System.out.println(Thread.currentThread().getName());
    }
}
