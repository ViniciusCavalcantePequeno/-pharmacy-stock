package Validators;

import exceptions.*;;

public class RemedyValidator {

    public boolean validateRemdeyName(String remedy){
        if (remedy.length() < 3 && remedy.length() > 50) {
            throw new RemedyDisabledException();
        } else {
            return true;
        }
    }
}