import java.util.Scanner;

public class challenge7 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your principle amount Rs: ");
            int p = input.nextInt();
            System.out.print("now, tell me your rate of comInt: ");
            float r = input.nextFloat();
            System.out.print("now, tell me for how many years are you borrow: ");
            float t = input.nextFloat();

            double comInt = p * Math.pow((1 + r /100), t);
            System.out.println("\ncomInt is " + comInt);
        }
    }

