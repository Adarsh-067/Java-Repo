import java.util.Scanner;

public class challenge9 {
    // multiplication table

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        table(num);
    }

    public static void table(int num){
        for (int i = 1; i <= 10; i++) {
            int table = i * num;
            System.out.println(num + " * " + i + " = " + table);
        }
    }
}
