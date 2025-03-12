import java.util.Scanner;

public class challenge1 {
    // minimum of two number

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        Scanner input  = new Scanner(System.in);
        System.out.print("please, enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Now, enter the second number: ");
        int num2 = input.nextInt();

        int result = num1 < num2 ? num1 : num2;
        System.out.println("Minimum number is: " + result);
    }
}
