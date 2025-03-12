package demo;

public class Package {
    public static void main(String[] args) {
        System.out.println("Hi");
        Car swift = new Car();
        System.out.println(swift.Hello());

        Car thar = new Car("swift",2500);
        System.out.println(thar);
    }
}
