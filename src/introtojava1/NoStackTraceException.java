package introtojava1;

public class NoStackTraceException extends Exception {

    // Constructor that also dissables strack trace
    public NoStackTraceException(String message) {
        super(message, null, false, false);
    }

    public static void main(String[] args) {
        try {
            throw new NoStackTraceException("Custom exception without stack trace");
        } catch (NoStackTraceException e) {
            System.out.println(e.getMessage());
        }
    }
}
