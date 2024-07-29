package Validators;

import exceptions.*;

public class NameDoctorValidator {

    public boolean validateDoctorName(String nameDoctor) {
        if (nameDoctor.length() < 3 && nameDoctor.length() > 15) {
            throw new NameDoctorDisabledException();
        } else {
            return true;
        }
    }
}