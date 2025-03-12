package in.challenge1;

public class testClass {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        circle cir = new circle(6);
        System.out.println(cir.calculateArea());
        square sq = new square(25);
        System.out.println(sq.calculateArea());
    }
}
