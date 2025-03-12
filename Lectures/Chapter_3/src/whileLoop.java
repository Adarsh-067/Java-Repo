import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
       int i = 0;               // initialization
       while (i < 5){             // condition
           System.out.println("greeting guy's");      // main code
           i++;                  // updating the value
       }

        int j = 0;
        while (j < 100){
            System.out.println(j);
            j++;
        }

        Scanner input  = new Scanner(System.in);
        System.out.print("enter a number: ");
        int h = 0;
        while (h<3){
            int num = input.nextInt();
            h++;
        }
        System.out.println(h);

        int count = 500;
//        int to = 0;
        while (count >= 200){
            System.out.println(count);
            count--;
//            to++;
        }
//        System.out.println(to);
    }
}
