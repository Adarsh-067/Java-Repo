import java.util.Scanner;
// write a table

public class challenge1 {
    public static void main(String[] args) {
        table(readNum());
    }

    public static int readNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number to write a table: ");
        int num = input.nextInt();
        return num;
    }

    public static void table(int value){
        System.out.print("table is: ");
        int i = 1;
        while (i <= 10){
           int table = i * value;
            System.out.print(table + " ");
           i++;
        }
    }
}