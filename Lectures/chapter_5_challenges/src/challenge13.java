import java.util.Scanner;

public class challenge13 {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        Scanner input = new Scanner(System.in);
       while (true){
           System.out.print("Enter a command: ");
           String command = input.next();
           if (command.equalsIgnoreCase("exit")){
               break;
           }
       }
        System.out.println("you hava successfully exited.");
    }
}
