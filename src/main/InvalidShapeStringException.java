package main;

public class InvalidShapeStringException extends RuntimeException {

    public InvalidShapeStringException(String message) {
        super(message);
    }

    public void printMessage() {
        System.out.println(getMessage());
    }
}
