package Exceptions;

public class QuantityDisabledException extends RuntimeException{
    public QuantityDisabledException(String message){
        super(message);
    }
}
