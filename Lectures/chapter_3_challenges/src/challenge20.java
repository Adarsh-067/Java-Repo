import java.util.Scanner;

public class challenge20 {
    // sum and Average in 2d array

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        Scanner input = new Scanner(System.in);
        System.out.print("please enter a size of row in the array: ");
        int s1 = input.nextInt();
        System.out.print("please enter a size of column in the array: ");
        int s2 = input.nextInt();

        int[][] myArr = new int[s1][s2];

        System.out.print("\nEnter a element of the array: ");
        int i = 0;
        while (i < myArr.length){
            int j = 0;
            while (j < myArr[i].length){
                myArr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }

        int sum = sum(myArr);
        System.out.println("sum of your array is: " + sum);
        float avg = Avg(sum,s1,s2);
        System.out.println("Avg of your array is: " + avg);
    }

    public static int sum(int[][] arr){
        int sum = 0;
        int i = 0;
        while (i < arr.length){
            int j = 0;
            while (j < arr[i].length){
                sum += arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static float Avg(int sum , int size1 , int size2){
        return (float) sum / (size1 * size2);
    }
}
