package Validators;

import exceptions.NamePatientDisabledException;

public class NamePatientValidator {

    public boolean validatePatientName(String namePatient) throws NamePatientDisabledException{
        if (namePatient.length() < 5 && namePatient.length() > 50) {
            throw new NamePatientDisabledException();
        } else {
            return true;
        }
    }
}