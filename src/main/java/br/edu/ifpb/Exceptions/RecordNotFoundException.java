package exceptions;

public class RecordNotFoundException extends RuntimeException {
    public RecordNotFoundException() {
        super("ficha não encotrada.");
    }
}