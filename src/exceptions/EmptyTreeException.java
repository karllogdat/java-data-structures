package exceptions;

public class EmptyTreeException extends Exception {
    public EmptyTreeException(String message) {
        super("Empty Tree Exception: " + message);
    }
}