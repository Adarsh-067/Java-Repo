package challenge3;

public class ThreadState extends Thread{
    @Override
    public void run() {
        System.out.printf("\n %s %s",Thread.currentThread().getName(),Thread.currentThread().getState());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        ThreadState t1 = new ThreadState();

        t1.start();
    }
}
