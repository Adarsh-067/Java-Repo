 class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public void depositMoney(double money){
        if (balance <= 0){
            System.out.println("Invalid deposit");
        }else {
            balance += money;
        }
    }

    public double withdrawMoney(double money) {
        if (balance >= money){
            balance -= money;
        }else if(balance <= 0){
            System.out.println("Invalid withdraw");
        }else {
            money = balance;
            balance = 0;
        }
         return money;
    }

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }
}
