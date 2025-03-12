package in.kgcoding.methodOverriding;

public class testClass {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        vehicle v = new vehicle();
        car   c = new car();
        plane p = new plane();

        c.start();
        p.start();
        v.start();
    }
}
