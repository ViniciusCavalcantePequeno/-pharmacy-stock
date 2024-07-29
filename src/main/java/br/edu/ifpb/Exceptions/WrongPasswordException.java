package exceptions;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException() {
        super("Senha incorreta, tente novamente.");
    }
}
