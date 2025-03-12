import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        long fact = factorial(num);
        System.out.println("factorial of your number is: " + fact);
    }

    public static long factorial(int num){
        System.out.println("factorial is " + num);
        if (num == 1){
            return 1;
        }
        return num * factorial(num-1);
    }

    public static long factorialIterative(int num){
        long result = 1;
        for (int i = 1; i <= num ; i++) {
            result *= i;
        }
        return  result;
    }
}
