import java.util.Scanner;

public class challenge3 {
    // find prime number

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        boolean result = isPrime(readNum());
        if (result){
            System.out.println("your number is prime");
        }else {
            System.out.println("your number is not prime");
        }
    }

    public static int readNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        return input.nextInt();
    }

    public static boolean isPrime(int value){
              int i = 2;
              while (i < value){
                  if (value % i == 0){
                      return false;
                  }
                  i++;
              }
              return true;
        }
}
