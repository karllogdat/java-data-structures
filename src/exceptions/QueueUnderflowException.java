package exceptions;

public class QueueUnderflowException extends RuntimeException {
    public QueueUnderflowException(String message) {
        super("Queue Underflow Exception: " + message);
    }
}
