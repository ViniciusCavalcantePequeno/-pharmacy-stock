package Validators;

import exceptions.CpfDisabledException;

public class CpfPharmaceuticalValidator {

    public boolean validateCpfPharmaceutico(String cpfPharmaceutical) throws CpfDisabledException {
         if (cpfPharmaceutical.length() != 14) {
            throw new CpfDisabledException();
        } else {
            return true;
        }
    }
}