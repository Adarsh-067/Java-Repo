package in.kgcoding.PassingReferenceAndValue;

public class PassByValue {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        int a = 5;
        int b = 8;

        int sum = add(a,b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("sum: " + sum);
        System.out.println("a " + a);
    }

    public static int add(int a , int b){
        a+=b;
        return a;
    }
}
