package lab7.ch2;

public class InsufficientFoundException extends Exception{

    public InsufficientFoundException() {
        super("The provided amount exceeds the debit of your account");
    }

}
