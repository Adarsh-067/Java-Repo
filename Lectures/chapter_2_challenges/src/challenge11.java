import java.util.Scanner;

public class challenge11 {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        Scanner input = new Scanner(System.in);
        System.out.print("please enter 3 number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is greater than ");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is greater than ");
        }else {
            System.out.println(num3 + " is greater than ");
        }
    }
}
