package Exceptions;

public class CpfDisabledException extends RuntimeException{
    public CpfDisabledException(String message){
        super(message);
    }
}
