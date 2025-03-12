import java.util.Scanner;

public class challenge4 {
    // study score categories

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your score: ");
        int num = input.nextInt();

        String categories = num > 80 ? "High" : (num > 50 ? "Moderate" : "Low");
        System.out.print("your categories is : " + categories);
    }
}
