package Validators;

public class Remedy {

    private String remedy;

    public Remedy validateRemdeyName(String remedy) throws RemedyDesabledException {
        if (remedy.length() < 5 && remedy.length() > 50) {
            throw new RemedyDesabledException("Nome invalido");
        }
        if (remedy.length() > 5 && remedy.length() < 50){
            remedy = this.remedy;
        }
    }
}