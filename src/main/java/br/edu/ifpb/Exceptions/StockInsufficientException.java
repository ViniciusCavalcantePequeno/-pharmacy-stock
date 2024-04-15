package Exceptions;

public class StockInsufficientException extends RuntimeException{
    public StockInsufficientException(String message){
        super(message);
    }
}
