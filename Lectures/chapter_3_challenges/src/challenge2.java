import java.util.Scanner;

public class challenge2 {
    //sum of odd number

    public static void main(String[] args) {
      int number = oddN(readNum());
        System.out.print("sum of your odd number is: " + number);
    }

    public static int readNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find sum of odd number: ");
        int num = input.nextInt();
        return num;
    }

    public static int oddN(int value){
        int i = 0;
        int temp = 0;
        while (i < value){
            if (i % 2 != 0){
                temp += i;
            }
            i++;
        }
        return temp;
    }
}
