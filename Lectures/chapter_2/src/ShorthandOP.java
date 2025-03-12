import java.util.Scanner;

public class ShorthandOP {
    public static void main(String[] args) {

        // Shorthand operator

        int a = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = input.nextInt();
        int x1 = input.nextInt();
        int x2 = input.nextInt();

//        a = a + x;
        a += x;
        System.out.println(a);
//        a = a + x1;
        a += x1;
        System.out.println(a);
//        a = a + x2;
        a += x2;
        System.out.println(a);

    }
}
