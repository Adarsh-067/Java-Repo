import java.util.Scanner;

public class DoWhileLO {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        Scanner input  = new Scanner(System.in);
        int age;
        do {
            System.out.print("Please, enter your Age: ");
             age = input.nextInt();
            if (age < 0 || age > 100){
                System.out.println("sahi age likh bhai");
            }else {
                continue;
            }
            age++;
        }while (age < 0 || age > 100);
        System.out.print("your age is: " + age);
    }
}
