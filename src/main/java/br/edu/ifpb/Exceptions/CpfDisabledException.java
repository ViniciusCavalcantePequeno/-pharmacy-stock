class CpfDisabledException extends RuntimeException{
    public CpfDisabledException(String message){
        super("CPF invalido");
    }
}