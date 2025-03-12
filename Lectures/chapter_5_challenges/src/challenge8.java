import java.util.Scanner;

public class challenge8 {
    // number guessing game

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        Scanner input = new Scanner(System.in);
        int num = 6;
        int guessNum;
        do {
            System.out.print("Please guess the number between 0 to 10: ");
            guessNum = input.nextByte();
        }while (num != guessNum);
        System.out.println("congratulation, your number is correct");
    }
}
