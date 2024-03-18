public class NamePatient {
    private String namePatient;

    public NamePatient validatePatientName(String namePatient) {
        if (NamePatient namePatient.length() < 5 && namePatient.length() > 50) {
            throw new 
        }
        if (NamePatient namePatient.length() > 5 && namePatient.length() < 50){
            namePatient = this.namePatient;
        }
    }
    public String getNamePatient() {
        return namePatient;
    }
    public void setNamePatient(String namePatient) {
        this.namePatient = namePatient;
    }
}