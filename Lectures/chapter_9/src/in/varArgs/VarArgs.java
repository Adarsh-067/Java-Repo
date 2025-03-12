package in.varArgs;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
//        multi(5,4);
        multi(1,2,5,6,1);
//        sum(new int[]{5, 6, 3, 8, 9});
        sum(2,6,3,5,1,6,8,9);
    }

    public static void multi(int a , int b){
        int sum = a+b;
        System.out.println(sum);
    }

    public static void multi(int... value){
        int multi = 1;
        for (int i : value) {
            multi *= i;
        }
        System.out.println("multiplication of your number is: " + multi);
    }

    public static void sum(int... value){
        int sum = 0;
        for (int i : value) {
            sum += i;
        }
        System.out.println("sum of your number is: " + sum);
    }
}
