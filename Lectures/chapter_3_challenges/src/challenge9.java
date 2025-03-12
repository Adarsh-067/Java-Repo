import java.util.Scanner;

public class challenge9 {
    // fibonacci series

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
          fibonacci(readNum());
    }

    public static int readNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    public static void fibonacci(int number){
        int a = 0 , b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        int i = 0;
        int c;
        while (i < number-1) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;
        }
    }
}
