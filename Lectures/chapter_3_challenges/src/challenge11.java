import java.util.Scanner;

public class challenge11 {
    // palindrome number
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        palindrome(readNum());
    }

    public static int readNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    public static void palindrome(int number){
       int ret =  reverseOfDigit(number);
        if (number == ret){
            System.out.println(number + " is palindrome");
        }else {
            System.out.println(number + " is not palindrome");
        }

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
