package exceptions;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Senha incorreta, tente novamente.");
    }
}
