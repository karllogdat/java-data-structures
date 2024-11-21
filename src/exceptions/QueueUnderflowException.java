package exceptions;

public class QueueUnderflowException extends Exception {
    public QueueUnderflowException(String message) {
        super("Queue Underflow Exception: " + message);
    }
}
