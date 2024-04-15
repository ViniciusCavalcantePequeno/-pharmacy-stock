package Validators;

import Exceptions.CpfDisabledException;

public class CpfDoctor {

    private String cpfDoctor;

    public String validatorCpfDoctor(String cpfDoctor){
        try {
            if(cpfDoctor.length() == 14){
                return cpfDoctor = this.cpfDoctor;
            }
            
        } catch (CpfDisabledException cpfDisabledException) {
            return "Por favor, forneça o cpf da seguinte forma: xxx.xxx.xxx-xx";
        }
        return null;
    }

    public String getCpfDoctor() {
        return cpfDoctor;
    }

    public void setCpfDoctor(String cpfDoctor) {
        this.cpfDoctor = cpfDoctor;
    }

}