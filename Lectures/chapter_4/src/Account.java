public class Account {
    String accountHolderName;
    int accountNumber;
    int totalBalance;

    public void setAccHolName(String name){
        accountHolderName = name;
    }

    public void setBalance(int amount){
        totalBalance = amount;
    }

    public void setAccountNum(int accountNumber){
        this.accountNumber = accountNumber;
    }

}
