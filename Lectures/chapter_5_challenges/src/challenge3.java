import java.util.Scanner;

public class challenge3 {
    // find absolute value

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int result = num >= 0 ? num : -num;
        System.out.print("Absolute value is " + result);
    }
}
