package in.VarArgs;

public class Varargs {
    public static void main(String... args) {
        System.out.println("Hello, Welcome to Variable Arguments concept in java!");
        System.out.println("sum is : " + sum(2,5));
//        System.out.println("sum is : " + sum(new int[]{1,2,3,4,5,6,7}));
        System.out.println("sum is : " + sum(1,2,3,4,5,6,7,8,9,10));

        printString("adarsh","ansh","sumit","amit","rohit","abhay","shiv","prabhuu");
    }

    public static int sum(int a , int b){
        return a + b;
    }

    /*public static int sum(int[] a){
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }*/

    public static int sum(int first, int second, int... a){
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static void printString(String... str){
        for (String s : str) {
            System.out.print(s+ " ");
        }
    }

}
