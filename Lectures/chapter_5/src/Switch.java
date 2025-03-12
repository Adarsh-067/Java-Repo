import javax.swing.plaf.SplitPaneUI;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your day in number: ");
        int num = input.nextInt();
        newSwitch(num);
    }

    public static void oldSwitch(int day){
        switch (day){
            case 1: {
                System.out.print("Monday");
                break;
            }
            case 2: {
                System.out.print("Tuesday");
                break;
            }
            case 3: {
                System.out.print("Wednesday");
                break;
            }
            case 4: {
                System.out.print("Thursday");
                break;
            }
            case 5: {
                System.out.print("Friday");
                break;
            }
            case 6: {
                System.out.print("Saturday");
                break;
            }
            case 7: {
                System.out.print("Sunday");
                break;
            }
            default:
                System.out.print("Invalid day");
        }
    }

    public static void newSwitch(int day){
        String output = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6,7 -> "Holiday";
            default -> "Invalid number";
        };
        System.out.println(output);
    }
}
