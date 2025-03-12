package in.synchronizeKeyword;

public class testing {
    public static void main(String[] args) {
        System.out.println("Hello, adarsh welcome to java world!\n");

        counter counter = new counter();
        updateThread t1 = new updateThread(counter);
        updateThread t2 = new updateThread(counter);

        try {
            t1.start();
            t2.start();

            t1.join();
            t2.join();
        }catch (InterruptedException e){
            System.out.println("thread interrupter: " + e.getMessage());
        }

        System.out.println("counter: " + counter.getCount());
    }
}
