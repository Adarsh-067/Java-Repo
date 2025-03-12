package challenge2;

public class printThread extends Thread{
    @Override
    public void run() {
        System.out.printf(" \n %s %d starting.",printThread.currentThread().getName(),target);
        try {
            Thread.sleep(4000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.printf("\n %s %d Ending.\n",printThread.currentThread().getName(),target);
    }

    private final int target;

    printThread(int target){
        this.target = target;
    }

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        printThread p1 = new printThread(1);
        printThread p2 = new printThread(2);
        printThread p3 = new printThread(3);

        try {
            p1.start();
            p1.join();

            p2.start();
            p2.join();

            p3.start();
            p3.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
