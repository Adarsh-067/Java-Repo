package in.encapsulation;

import java.util.Scanner;

class bank implements display{
    private final long accountNumber =  470055667;
    private long cashAmount = 5000;
    private int accountPin = 1052;

    Scanner input = new Scanner(System.in);

    public double getAccountNumber(){
        System.out.print("if you are user or employee: ");
        String value = input.next();
        if (value.equals("user")){
            return accountNumber;
        }else {
            return accountNumber;
        }
    }

    public long getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(long cashAmount) {
        this.cashAmount = cashAmount;
    }

    public int getAccountPin() {
        return accountPin;
    }

    public void setAccountPin(int accountPin) {
        this.accountPin = accountPin;
    }

    @Override
    public void describe() {
        System.out.println("Hi, i am interface class ");
    }
}
