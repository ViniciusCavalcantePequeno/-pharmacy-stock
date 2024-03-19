package DAO;

public class NamePatient {
    private String namePatient;

    public NamePatient validatePatientName(String namePatient) {
        if (namePatient.length() > 5 && namePatient.length() < 50){
            namePatient = this.namePatient;
        }
        if (namePatient.length() < 5 && namePatient.length() > 50) {
            throw new 
        }
    }

    public String getNamePatient() {
        return namePatient;
    }

    public void setNamePatient(String namePatient) {
        this.namePatient = namePatient;
    }
}