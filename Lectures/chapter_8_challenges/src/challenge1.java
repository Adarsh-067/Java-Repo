import java.io.FilterOutputStream;
import java.util.Scanner;

public class challenge1 {
    // Arithmetic exception handling

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world\n");

        Scanner input = new Scanner(System.in);
        System.out.print("please enter first number: ");
        int num = input.nextInt();
        System.out.print("Now, second number: ");
        int num2 = input.nextInt();

        try {
            int result = num / num2;
            System.out.println(result);
        }catch (ArithmeticException exception){
            if (exception.getMessage().equals("/ by zero")){
                System.out.println("Division by zero occur");
            }else {
                throw exception;
            }
        }
    }
}
