package in.ExceptionHandling.customException;

public class FoundInsufficientBalanceException extends Exception{
    public FoundInsufficientBalanceException(){
        super("what are you doing? you don't have money~");
    }

}
