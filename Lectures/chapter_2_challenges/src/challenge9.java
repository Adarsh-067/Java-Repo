import java.util.Scanner;

public class challenge9 {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        Scanner input = new Scanner(System.in);
        System.out.print("please enter any number: ");
        int num = input.nextInt();

        if (num == 0){
            System.out.println("number is 'zero'");
        } else if(num < 0){
            System.out.println("number is 'negative'");
        }else {
            System.out.println("number is 'positive'");
        }
    }
}
