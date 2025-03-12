package in.priorityThread;

public class PriorityThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {
            System.out.printf("%d%c ",i,targetChar);
        }
        System.out.printf("\n%s %c task done.\n" ,Thread.currentThread().getName(),targetChar);
    }

    private final char targetChar;

    public PriorityThread(char targetChar){
        this.targetChar = targetChar;
    }

}
