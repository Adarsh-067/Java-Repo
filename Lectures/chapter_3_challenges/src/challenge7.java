import java.util.Scanner;

public class challenge7 {
    // lcm of two number

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number: ");
        int first = input.nextInt();
        System.out.print("please enter your number: ");
        int second = input.nextInt();

        int lcm = lcm(first,second);
        System.out.print("\nLCM of the two number is: " + lcm);
    }

    public static int lcm(int first , int second){
        int i = 1;
        while (i <= second) {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }
        return 0;
    }

}

