package in.needOfThread;

public class needOfMultiThreading {
    public static void main(String[] args) {
        //first task
        System.out.print("first task\n");
        for (int i = 1; i < 1000; i++) {
            System.out.printf("%d* ",i);
        }

        System.out.print("\nsecond task\n");
        for (int i = 1; i < 1000; i++) {
            System.out.printf("%d$ ",i);
        }

        System.out.print("\nthird task\n");
        for (int i = 1; i < 1000; i++) {
            System.out.printf("%d@ ",i);
        }


    }
}
