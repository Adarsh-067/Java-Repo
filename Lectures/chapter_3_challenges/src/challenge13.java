import java.util.Scanner;

public class challenge13 {
        //number of occurrence
        public static void main(String[] args) {
            System.out.println("Hello, Adarsh welcome to java world!\n");
            int[] Arr = ArrayUtility.inputArray();
//            int result = found(Arr);
//            System.out.println("occurrence of number is " + result + " times in Array");
        }

        public static int found(int[] Arr,int num){
            Scanner input = new Scanner(System.in);
//            System.out.print("Enter a number to find occurrence of number in Array: ");
//            int num = input.nextInt();
            int count = 0;
            int i = 0;
            while (i < Arr.length){
                if (Arr[i] == num){
                    count++;
                }
                i++;
            }
            return count;
        }
    }
