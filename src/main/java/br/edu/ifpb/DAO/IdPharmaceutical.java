package DAO;

public class IdPharmaceutical {
    private String idPharmaceutical;

    public IdPharmaceutical validateIdPharmaceutico(String idPharmaceutical) {
        if (IdPharmaceutical idPharmaceutical.length() < 5 && idPharmaceutical.length() > 50) {
            throw new 
        }
        if (IdPharmaceutical idPharmaceutical.length() > 5 && idPharmaceutical.length() < 50){
            idPharmaceutical = this.idPharmaceutical;
        }
    }
}