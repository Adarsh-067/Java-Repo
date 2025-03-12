import java.util.Scanner;

public class TernaryOP {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Now, enter the second number: ");
        int num2 = input.nextInt();

        int greaterNUmber = num1 > num2 ? num1 : num2;
        System.out.print(greaterNUmber);

    }
}
