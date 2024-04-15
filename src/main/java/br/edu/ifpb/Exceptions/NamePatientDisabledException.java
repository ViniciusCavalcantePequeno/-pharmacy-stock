package Exceptions;

public class NamePatientDisabledException extends RuntimeException {
    public NamePatientDisabledException(String message) {
        super(message);
    }
}
