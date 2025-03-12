public class Customer {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        BankAccount account = new BankAccount("123","sumit");
        account.depositMoney(500);
        System.out.println(account.withdrawMoney(250));
    }
}
