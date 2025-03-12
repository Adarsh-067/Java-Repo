package in.wrapper;

public class demo {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to wrapper class in java~\n");

        int a = 5;
//        Integer b = new Integer(50);
        Integer b = 50;
        b = 10;
        System.out.println(b);
        System.out.println(a);

        Integer fist = 5;   // Autoboxing
        Integer sec = 5;

        Integer result = fist  + sec;
        int sum = result;   // unboxing
        System.out.println("sum is: " + result);
        System.out.println(sum);

        System.out.println(multiple(5,6));
    }

    public static Integer multiple(Integer a , Integer b){
        return  a*b;
    }
}
