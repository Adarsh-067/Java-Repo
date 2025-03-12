import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh Welcome to Java world!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();

        System.out.println("sum is: " + (first + second));
        System.out.println("multiply is: " + (first * second));
        System.out.println("subtraction is: " + (first - second));
        System.out.println("division is: " + (first / second));
        System.out.println("reminder is: " + (first % second));
    }
}
