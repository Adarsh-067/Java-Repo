import java.util.Scanner;

public class challenge12 {
    // occurrence of element in an array

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        System.out.print("\nEnter a number to find: ");
        int num = input.nextInt();

        int result = counter(arr, num);
        System.out.println("\noccurrence of your number is " + result + " times");
    }

    public static int counter(int[] arr , int number){
        int count = 0;
        for (int num: arr){
            if (num == number){
                count++;
            }
        }
        return count;
    }
}
