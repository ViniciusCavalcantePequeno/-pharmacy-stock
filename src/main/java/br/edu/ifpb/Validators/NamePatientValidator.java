package Validators;

import exceptions.*;

public class NamePatientValidator {

    public boolean validatePatientName(String namePatient) {
        if (namePatient.length() < 5 && namePatient.length() > 50) {
            throw new NamePatientDisabledException();
        } else {
            return true;
        }
    }
}