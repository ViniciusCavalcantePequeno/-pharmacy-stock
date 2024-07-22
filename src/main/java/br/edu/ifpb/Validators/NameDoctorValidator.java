package Validators;

import exceptions.NameDoctorDisabledException;

public class NameDoctorValidator {

    public boolean validateDoctorName(String nameDoctor) throws NameDoctorDisabledException {
        if (nameDoctor.length() < 3 && nameDoctor.length() > 15) {
            throw new NameDoctorDisabledException();
        } else {
            return true;
        }
    }
}