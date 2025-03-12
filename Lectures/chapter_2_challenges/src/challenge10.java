import java.util.Scanner;

public class challenge10 {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        Scanner input = new Scanner(System.in);
        System.out.print("please enter any number: ");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("your number is 'even'");
        }else {
            System.out.println("your number is 'odd'");
        }
    }
}
