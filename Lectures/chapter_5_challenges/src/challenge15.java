import java.util.Scanner;

public class challenge15 {
    // print even number and skip odd using continue

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            if (i % 2 != 0){
                continue;
            }else {
                System.out.print(i + " ");
            }
        }

    }
}
