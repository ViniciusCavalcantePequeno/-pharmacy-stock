package exceptions;
 
public class CpfDisabledException  extends RuntimeException{
    public CpfDisabledException(){
        super("CPF invalido");
    }
}