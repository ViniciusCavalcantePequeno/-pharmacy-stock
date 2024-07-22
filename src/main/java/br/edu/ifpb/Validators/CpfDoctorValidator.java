package Validators;

import exceptions.CpfDisabledException;

public class CpfDoctor {


    public boolean validateCpfDoctor(String cpfDoctor) throws CpfDisabledException {
        if (cpfDoctor.length() != 14) {
            throw new CpfDisabledException();
        } else {
            return true;
        }
    }
}