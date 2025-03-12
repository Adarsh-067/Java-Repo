package in.synchronizeKeyword;

public class updateThread extends Thread{
    private final counter counter;

   public updateThread(counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}
