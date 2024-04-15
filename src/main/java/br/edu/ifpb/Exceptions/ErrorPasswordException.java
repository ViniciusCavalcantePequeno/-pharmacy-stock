package Exceptions;

public class ErrorPasswordException extends RuntimeException {
    public ErrorPasswordException(String message){
        super(message);
    }
}
