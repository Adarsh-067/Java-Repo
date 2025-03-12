import java.util.Scanner;

public class challenge12 {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        Scanner input = new Scanner(System.in);
        System.out.print("please enter the year that you want to check leap year: ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("your year is a leap year");
        }else {
            System.out.println("your year is not a leap year");
        }
    }
}
