package DAO;

public class CpfPharmaceutical {

    private String cpfPharmaceutical;

    public CpfPharmaceutical validateCpfPharmaceutico(String cpfPharmaceutical) {
        if (cpfPharmaceutical.length() > 5 && cpfPharmaceutical.length() < 50){
            cpfPharmaceutical = this.cpfPharmaceutical;
        }
        
        if (cpfPharmaceutical.length() < 5 && cpfPharmaceutical.length() > 50) {
            throw new 
        }
    }

    public String getCpfPharmaceutical() {
        return cpfPharmaceutical;
    }

    public void setCpfPharmaceutical(String cpfPharmaceutical) {
        this.cpfPharmaceutical = cpfPharmaceutical;
    }
}