package in.ExceptionHandling;

public class Exception {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to Exception Handling concept in java! ");
        int[] num = {100,400,300,800};
        int[] deno = {10,20,0,40};
        for (int i = 0; i < num.length; i++) {
            System.out.println(divide(num[i] , deno[i]));
        }
        System.out.println("Good Job :)");

       /* int[] arr = {1,2,3,4,5};

            System.out.println(arr[0]);
            System.out.println(arr[2]);
            try {
                System.out.println(arr[6]);
            }catch (java.lang.Exception e){
                System.out.println(e);
            }
            System.out.println(arr[3]);
            System.out.println(arr[4]);*/
    }

    public static int divide(int a, int b){
        try {
            return a / b;
        }catch (ArithmeticException e){
            System.out.println(e);
            return -1;
        }
    }
}