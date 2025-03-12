import java.util.Scanner;

public class challenge10 {
    // Armstrong number

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        int num = readNum();
        int isArms = Armstrong(num);
        if (isArms == num){
            System.out.println(num + " is Armstrong number");
        }else{
            System.out.println(num + " is not Armstrong number");
        }
    }

    public static int readNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    public static int Armstrong(int number){
        int sum = 0;
        int i = 0;
        while (number > 0){
            int d = number % 10;
            sum += d*d*d;
            number /= 10;
            i++;
        }
        return sum;
    }
}
