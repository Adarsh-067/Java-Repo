import java.util.Scanner;

public class challenge12 {
    // sum and average of array
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

//        Scanner input  = new Scanner(System.in);
//
//        System.out.print("Enter the size of Array: ");
//        int size = input.nextInt();
//        System.out.print("Enter the value of Array: ");
//        int[] Arr = new int[size];
//
//        int index = 0;
//        while (index < size){
//            Arr[index] = input.nextInt();
////            System.out.println(Arr[index]);
//            index++;
//        }

        int[] array = ArrayUtility.inputArray();

        int sum = 0;
        float avg = 0;
        int i = 0;
        while (i < array.length){
            sum += array[i];
            avg = (float) sum / array.length;
            i++;
        }

        System.out.println("sum is: " + sum);
        System.out.println("Average is: " + avg);

    }
}
