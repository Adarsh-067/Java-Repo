import java.util.Scanner;

public class challenge16 {
    // Return new array deleting a specific element.

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        Scanner input = new Scanner(System.in);
        int[] Arr = ArrayUtility.inputArray();
        System.out.print("\nEnter a number to delete: ");
        int num = input.nextInt();
        int[] newArr = ArrayToDelete(Arr , num);
        System.out.println("\nNew Array Here: ");
        System.out.print("=> ");
        ArrayUtility.displayArray(newArr);
    }

    public static int[] ArrayToDelete(int[] Arr , int numbToDelete){
        int occ = challenge13.found(Arr , numbToDelete);
        if (occ == 0){
            return Arr;
        }
        int newSize = Arr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while (i < Arr.length){
            if (Arr[i] != numbToDelete) {
            newArr[j] = Arr[i];
            j++;
            }
        i++;
        }
        return newArr;
    }
}
