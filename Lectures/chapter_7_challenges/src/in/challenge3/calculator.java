package in.challenge3;

public class calculator {
    public void add(int a, int b){
        System.out.println("sum of your number is: " + (a + b));
    }

    public void add(int a, int b , int c){
        System.out.println("sum of your number is: " + (a + b + c));
    }

    public void add(double a, double b){
        System.out.println("sum of your number is: " + (a + b));
    }

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        calculator c = new calculator();
        c.add(5,19);
        c.add(15.5,152);
        c.add(5,6,4);
    }
}
