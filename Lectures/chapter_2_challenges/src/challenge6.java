import java.util.Scanner;

public class challenge6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your principle amount Rs: ");
        int p = input.nextInt();
        System.out.print("now, tell me your rate of interest: ");
        float r = input.nextFloat();
        System.out.print("now, tell me for how many years are you borrow: ");
        float t = input.nextFloat();

        float interest = ((p*r*t)/100);
        System.out.println("\nsimple interest is " + interest);
    }
}
