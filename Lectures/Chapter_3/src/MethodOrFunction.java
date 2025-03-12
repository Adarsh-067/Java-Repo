import java.util.Scanner;

public class MethodOrFunction {
    public static void main(String[] args) {
        greet();
        int first = readNumber();
        int second = readNumber();

        int sum = first + second;
        System.out.println("sum is " + sum);
    }

    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number: ");
        int number = input.nextInt();
        return number;
    }

    public static void greet(){
        System.out.println("Hello, Adarsh welcome to java world!\n");
    }

    public static void demo(String name){
        System.out.println("Hello " + name + "☺");
    }

    public static void pattern(int num){
        int row = 0;
        while (row < num){
            System.out.print("☺");
            int i = 0;
            while (i < row){
                System.out.print(" ☺");
//                System.out.print(".");
                i++;
            }
            System.out.println();
            row++;
        }


    }
}
