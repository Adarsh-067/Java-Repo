import java.util.Scanner;

public class challenge5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of the triangle: ");
        double b = input.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double h = input.nextDouble();

        double Area = (b * h) / 2;
        System.out.println("Area is " + Area + " cms");
    }
}
