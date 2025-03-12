package in.MultiThreading;

public class thirdTask extends Thread{
    // third task
    @Override
    public void run() {
//        System.out.println("third thread: \n");
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d@ ",i);
        }
        System.out.println("\nthird task done: ");

    }
}
