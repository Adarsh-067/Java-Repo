import java.util.Scanner;

public class challenge7 {
    // password checker

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        Scanner input = new Scanner(System.in);
        String password;
        do {
            System.out.println("Please enter your password: ");
            password = input.next();
        }while (!isValidPassword(password));
        System.out.println("Thanks for entering a valid password");
    }

    public static boolean isValidPassword(String pass){
        return pass.length() > 6;
    }
}
