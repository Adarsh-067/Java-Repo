public class customer {
    public static void main(String[] args) {
        Account first = new Account();
        first.setAccHolName("Adarsh chaubey");
        System.out.println(first.accountHolderName);
        first.setAccountNum(1205);
        System.out.println(first.accountNumber);
        first.setBalance(50000);
        System.out.println(first.totalBalance);
    }
}
