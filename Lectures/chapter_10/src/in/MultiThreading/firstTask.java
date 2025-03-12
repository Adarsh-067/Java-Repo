package in.MultiThreading;

public class firstTask extends Thread{
    // first task
    @Override
    public void run() {
//        System.out.println("first thread: \n ");
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.println("\nfirst task done: ");

    }
}
