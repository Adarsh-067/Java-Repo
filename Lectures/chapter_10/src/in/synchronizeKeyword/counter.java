package in.synchronizeKeyword;

public class counter {
    private int count;

    public synchronized void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
}
