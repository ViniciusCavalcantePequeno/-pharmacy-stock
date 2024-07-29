package exceptions;

public class QuantityDisabledException extends RuntimeException {
    public QuantityDisabledException() {
        super("Quantidade insuficiente");
    }
}