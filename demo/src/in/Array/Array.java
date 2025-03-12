package in.Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String[] str = new String[5];
        System.out.print("Enter values in in.Array.Array: ");

      /*  for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }

        for (String s : str) {
            System.out.println(s);
        }*/

        // second method to declaration in.Array.Array [C-Style in.Array.Array]

        int num[] = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }

      /* int[] number = num.clone();

        for (int n : number){
            System.out.println(n);
        }*/


       /* for (int N : num){
            System.out.println(N);
        }*/
    }
}
