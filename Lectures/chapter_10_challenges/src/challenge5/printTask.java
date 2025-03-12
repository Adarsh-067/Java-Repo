package challenge5;

public class printTask implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%d%c ",i,targetChar);
        }
        System.out.printf("\n%s %c task done.\n" ,Thread.currentThread().getName(),targetChar);
    }

    private final char targetChar;

    public printTask(char targetChar){
        this.targetChar = targetChar;
    }

}
