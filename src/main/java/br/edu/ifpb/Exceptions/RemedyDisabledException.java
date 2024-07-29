package exceptions;

public class RemedyDisabledException extends RuntimeException{
    public RemedyDisabledException(){
        super("Remedio inválido");
    }
}