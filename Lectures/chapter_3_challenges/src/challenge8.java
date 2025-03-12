import java.util.Scanner;

public class challenge8 {
    // Hcf of two number

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number: ");
        int first = input.nextInt();
        System.out.print("please enter your number: ");
        int second = input.nextInt();

        int gcd = gcd(first,second);
        System.out.print("\nHCF of the two number is: " + gcd);
    }

    public static int gcd(int first , int second){
        int gcd = 1;
        int i = 2;
        int least = least(first, second);
        while (i <= least){
            if (first % i == 0 && second % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1 , int num2){
        if (num1 < num2){
            return num1;
        }else {
            return num2;
        }
    }
}
