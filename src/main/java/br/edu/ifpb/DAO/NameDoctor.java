public class NameDoctor {
    private String nameDoctor;

    public NameDoctor validateDoctorName(String nameDoctor) {
        if (NameDoctor nameDoctor.length() < 5 && nameDoctor.length() > 50) {
            throw new 
        }
        if (NameDoctor nameDoctor.length() > 5 && nameDoctor.length() < 50){
            nameDoctor = this.nameDoctor;
        }
    }
    public String getNameDoctor() {
        return nameDoctor;
    }
    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }
}