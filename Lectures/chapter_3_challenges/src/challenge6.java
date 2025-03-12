import java.util.Scanner;

public class challenge6 {
    // Reverse of the digits

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        int result = reverseOfDigit(readNum());
        System.out.println("Reverse number is: " + result);
    }

    public static int readNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        return num;
    }

    public static int reverseOfDigit(int number){
        int reverse = 0;
        while (number != 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        return reverse;
    }
}
