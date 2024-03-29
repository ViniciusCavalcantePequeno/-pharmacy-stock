package DAO;

public class PharmaceuticalDAO {

    private StockDAO remedy;
    private PrescriptionDAO prescription;

    public void seePrescriptions() {
        System.out.println(prescription.listPrescriptions());
    }

    public void dispatchPrescription(int cardSUS) {
        prescription.removerPrescription(cardSUS);
    }

    public void searchRemedyId(int id) {
        System.out.println(remedy.searchRemedyId(id));
    }

    // public void porprescriptionEmEspera();

}
