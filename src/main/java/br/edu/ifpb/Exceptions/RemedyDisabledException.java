class RemedyDisabledException extends RuntimeException{
    public RemedyDisabledException(String message){
        super("Remedio inválido");
    }
}