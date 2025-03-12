import java.util.Scanner;

    public class ArrayUtility {
        public static int[] inputArray(){
            Scanner input  = new Scanner(System.in);

            System.out.print("Enter the size of Array: ");
            int size = input.nextInt();
            int[] Arr = new int[size];

            int index = 0;
            while (index < size){
                System.out.print("Enter element no " + (index+1) + " : ");
                Arr[index] = input.nextInt();
                index++;
            }
            return Arr;
        }

        public static void displayArray(int[] arr){
            int i = 0;
            while (i < arr.length){
                System.out.print(arr[i] + " ");
                i++;
            }
        }
    }

