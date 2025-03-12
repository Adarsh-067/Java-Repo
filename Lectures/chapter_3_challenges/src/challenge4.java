import java.util.Scanner;

public class challenge4 {
    // factorial

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            long factorial = 1;
            int i = 1;
            while (i <= num){
                factorial *= i;
                i++;
            }

            System.out.println("The factorial of " + num + " is " + factorial);
        }
    }