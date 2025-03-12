import java.util.Scanner;

public class challenge5 {
    // sum of digits

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        int result = sumOfDigit(readNum());
        System.out.println("sum of digit is: " + result);
    }

    public static int readNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        return num;
    }

    public static int sumOfDigit(int number){
        int sum = 0;
        while (number >0){
            int digit = number % 10;
            sum += digit;
            number = number /10;
        }
        return sum;
    }
}
