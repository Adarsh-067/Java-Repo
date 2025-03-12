import java.util.Scanner;

public class challenge4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter all 4 sides in cms: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        System.out.println("perimeter is " + (a + b + c + d) + " cm");
    }
}
