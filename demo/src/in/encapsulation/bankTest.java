package in.encapsulation;

public class bankTest{
    public static void main(String[] args) {
        System.out.println("Hello, welcome to encapsulation concept!");
        bank cst = new bank();
//        System.out.println(cst.getAccountNumber());
        System.out.println(cst.getCashAmount());
        cst.setCashAmount(10000);
        System.out.println(cst.getCashAmount());
        cst.describe();
    }
}
