package Exceptions;

public class RemedyNotFoundException extends RuntimeException{
    public RemedyNotFoundException(String message){
        super(message);
    }
}
