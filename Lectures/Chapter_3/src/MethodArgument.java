public class MethodArgument {
    public static void main(String[] args) {
        int num = sumTN(5,6);
        System.out.println(num);
        System.out.println(sumTN(5,10));
        System.out.println(sumTN(5,100));
    }

    public static int sumTN(int first,int second){
        System.out.println("first number received: " + first);
        System.out.println("second number received: " + second);
        int sum = first + second;
        return sum;
    }
}
