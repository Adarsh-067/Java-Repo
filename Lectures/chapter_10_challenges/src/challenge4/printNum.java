package challenge4;

public class printNum implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Number is: " + i);
        }
    }
}
