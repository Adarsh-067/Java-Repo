package in.functional_Interface;

public class Test {
    int a = 10;    // this is called instance variable.
    public static void main(String[] args) {
//        car c = () -> System.out.println("car is start@");

        car c2 = new car()
            // this is anonymous inner class.
        {
            int a = 10;   // this is called local variable.
            @Override
            public void start() {
                System.out.println("car is start please wait!");
            }

            @Override
            public void stop() {
                System.out.println("car is stop please wait!");
            }
        };

        car car = new driver();
        car.start();
        car.stop();
    }
}



