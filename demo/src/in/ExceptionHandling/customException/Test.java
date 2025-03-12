package in.ExceptionHandling.customException;

public class Test {
    public static void main(String[] args){
        Bank b = new Bank(10);
       try {
           b.withdraw(11);
       }catch (FoundInsufficientBalanceException e){
           System.out.println(e);
       }
    }
}
