import java.util.Scanner;

public class challenge2 {
    // find even and odd number

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        String result = num % 2 == 0 ? "even" : "odd";
        System.out.println(num + " is " + result + " number");
    }
}
