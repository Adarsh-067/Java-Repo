package in.functional_Interface;

public class driver implements car{
    @Override
    public void start() {
        System.out.println("car is start!");
    }

    @Override
    public void stop() {
        System.out.println("car is stop!");
    }
}
