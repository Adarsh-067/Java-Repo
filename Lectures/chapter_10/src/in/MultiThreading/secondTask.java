package in.MultiThreading;

public class secondTask extends Thread{
    // second task
    @Override
    public void run() {
//        System.out.println("second thread: ");
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d# ",i);
        }
        System.out.println("\nsecond task done: ");

    }
}
