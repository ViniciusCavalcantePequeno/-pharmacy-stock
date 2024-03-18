public class RemedyNotFoundException extends RuntimeException {
    public RemedyNotFoundException() {
        super("Esse remedio não está cadastrado.");
    }
}