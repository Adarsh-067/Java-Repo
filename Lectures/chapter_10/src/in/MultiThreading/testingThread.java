package in.MultiThreading;

public class testingThread {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        long startTime = System.currentTimeMillis();

        firstTask t1 = new firstTask();
        secondTask t2 = new secondTask();
        thirdTask t3 = new thirdTask();

        t1.start();
        t2.start();
        t3.start();

        long endTime = System.currentTimeMillis();

//        System.out.printf("\nexecute time: %d \n",endTime-startTime);
    }
}
