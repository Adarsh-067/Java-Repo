import java.util.Scanner;

public class challenge3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first = input.nextFloat();
        System.out.print("now, please enter second number: ");
        double second = input.nextFloat();

        System.out.println("product of this number is: " + first * second);
    }
}
