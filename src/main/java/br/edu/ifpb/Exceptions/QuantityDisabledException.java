class QuantityDisabledException extends RuntimeException{
    public QuantityDisabledException(String message){
        super("Quantidade insuficiente");
    }
}