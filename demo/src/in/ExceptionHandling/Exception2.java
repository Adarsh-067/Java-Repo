package in.ExceptionHandling;

public class Exception2 {
    public static void main(String[] args) {
        int[] num = {100,400,300,800};
        int[] deno = {10,20,0,40};
        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(divide(num[i] , deno[i]));
            }catch (ArithmeticException e){
                throw new ArithmeticException(e.getMessage());
            }
        }
        System.out.println("Good Job :)");
    }

    public static int divide(int a , int b) throws ArithmeticException{
        return a/b;
    }
}
