package in.ExceptionHandling.customException;

public class Bank{
    private double balance;

    public Bank(double balance){
        this.balance = balance;
    }

    public void withdraw(int amount) throws FoundInsufficientBalanceException {
        if (balance > amount){
            System.out.println(amount);
            balance -= amount;
        }
        throw new FoundInsufficientBalanceException();
    }

}
