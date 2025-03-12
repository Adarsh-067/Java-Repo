import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        int[] Arr = {10,20,30,40,50,60,70,80,90,100};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find the Array: ");
        int num = input.nextInt();
        boolean isFound = isFound(Arr,num);
        if (isFound){
            System.out.println("your number is found in Array");
        }else {
            System.out.println("your number is not found in Array");
        }
    }

    public static boolean isFound(int[] Arr , int num){
        int i = 0;
        while (i < Arr.length){
            if (Arr[i] == num){
                return true;
            }
                i++;
        }
        return false;
    }
}
