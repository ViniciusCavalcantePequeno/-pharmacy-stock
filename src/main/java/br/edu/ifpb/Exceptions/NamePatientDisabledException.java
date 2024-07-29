package exceptions;

public class NamePatientDisabledException extends RuntimeException {
    public NamePatientDisabledException() {
        super("Nome de paciente invalido");
    }
}