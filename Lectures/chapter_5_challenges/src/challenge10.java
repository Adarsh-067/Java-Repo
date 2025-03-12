import java.util.Scanner;

public class challenge10 {
    // number is prime or not

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to check is prime or not: ");
        int num = input.nextInt();
        boolean prime = isPrime(num);
        System.out.println("your number is" + (prime ? " prime" : " not prime"));
    }

    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
