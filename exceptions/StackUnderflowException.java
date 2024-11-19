package exceptions;

public class StackUnderflowException extends RuntimeException {
    public StackUnderflowException(String message) {
        super("Stack Underflow Exception: "+ message);
    }
}
