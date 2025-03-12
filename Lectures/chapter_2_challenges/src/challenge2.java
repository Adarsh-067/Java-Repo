import java.util.Scanner;

public class challenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("now, please enter second number: ");
        int second = input.nextInt();

        System.out.println("sum: " + (first + second));
        System.out.println("subtract: " + (first - second));
        System.out.println("multiply: " + (first * second));
        System.out.println("division: " + (first / second));
    }
}
