package Validators;

import Exceptions.CpfDisabledException;

public class CpfPharmaceutical {

    private String cpfPharmaceutical;

    public String validatorCpfPharmaceutical(String cpfPharmaceutical) {
        try {
            if (cpfPharmaceutical.length() == 14) {
                return cpfPharmaceutical = this.cpfPharmaceutical;
            }

        } catch (CpfDisabledException cpfDisabledException) {
            return "Por favor, forneça o cpf da seguinte forma: xxx.xxx.xxx-xx";
        }
        return null;
    }

    public String getCpfPharmaceutical() {
        return cpfPharmaceutical;
    }

    public void setCpfPharmaceutical(String cpfPharmaceutical) {
        this.cpfPharmaceutical = cpfPharmaceutical;
    }

}