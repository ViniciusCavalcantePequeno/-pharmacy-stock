package Validators;

import exceptions.RemedyDisabledException;

public class RemedyValidator {

    public boolean validateRemdeyName(String remedy) throws RemedyDisabledException {
        if (remedy.length() < 3 && remedy.length() > 50) {
            throw new RemedyDisabledException();
        } else {
            return true;
        }
    }
}