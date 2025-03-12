import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh Welcome to Java World!");
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your name: ");
        String name = input.nextLine();
        System.out.println("Hi, " + name);
        System.out.print(name + ", Also tell you age: ");
        int age = input.nextInt();
        System.out.println("your Age is: " + age + " year");
    }
}
