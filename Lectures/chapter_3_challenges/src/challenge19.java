import java.util.Scanner;

public class challenge19 {
    // search an element in a 2D-Array

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

        System.out.println("2D-Array is here:");
        System.out.println("=>");
        int m = 0;
        while (m < myArr.length){
            int n = 0;
            while (n < myArr[m].length){
                System.out.print(myArr[m][n]+" ");
                n++;
            }
            System.out.println();
            m++;
        }

        System.out.print("\nEnter a element to find: ");
        int num = input.nextInt();

        boolean isResult = searchElement(myArr,num);
        if (isResult){
            System.out.println("\nyour number is found in Array ☻");
        }else {
            System.out.println("\nyour number is not found in Array ☺");
        }
    }

    public static boolean searchElement(int[][] arr, int num){
        int i = 0;
        while (i < arr.length){
            int j = 0;
            while (j < arr[i].length){
                if (arr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
