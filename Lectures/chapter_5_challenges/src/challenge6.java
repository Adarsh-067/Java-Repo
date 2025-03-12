import java.util.Scanner;

public class challenge6 {
    // Simple calculator

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        Scanner input = new Scanner(System.in);

        System.out.print("Press 1 to Add\nPress 2 to Sub\nPress 3 to multiplication\nPress 4 to division\n\nPlease, enter the value: ");
        int value = input.nextInt();
        System.out.print("\nPlease enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Now, enter the second number: ");
        int num2 = input.nextInt();

        float result = calculator(num1,num2,value);
        System.out.println("\nyour result is : " + result);
    }

    public static float calculator(int num1 , int num2 , int value){
        return switch (value){
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> num1 * num2;
            case 4 ->(float) num1 / num2;
            default -> 0;
        };
    }
}
