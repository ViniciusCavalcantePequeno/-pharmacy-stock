package Validators;

import Exceptions.NameDoctorDisabledException;

public class CpfDoctor {

    private String cpfDoctor;

    public CpfDoctor validateCpfDoctor(String cpfDoctor) {
        if (cpfDoctor.length() > 5 && cpfDoctor.length() < 50){
            cpfDoctor = this.cpfDoctor;
        }
        if (cpfDoctor.length() < 5 && cpfDoctor.length() > 50) {
            throw new CpfDesabledExeption();
        }
    }

    public String getCpfDoctor() {
        return cpfDoctor;
    }

    public void setCpfDoctor(String cpfDoctor) {
        this.cpfDoctor = cpfDoctor;
    }
}