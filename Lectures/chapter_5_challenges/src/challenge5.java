import java.util.Scanner;

public class challenge5 {
    // print month of year

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of month: ");
        int num = input.nextInt();
        String result = month(num);
        System.out.print("Month is : " + result);
    }

    public static String month(int day){
        return switch (day){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid number";
        };
    }
}
