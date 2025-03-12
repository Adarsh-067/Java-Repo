import java.util.Scanner;

public class challenge16 {
    // fibonacci series using recursion

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to print fibonacci series: ");
        int count = input.nextByte();

        for (int i = 1; i <= count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int position){
        if (position == 1){
            return 0;
        }
        if (position == 2){
            return 1;
        }
        return fibonacci(position - 1) + fibonacci(position - 2);
    }
}
