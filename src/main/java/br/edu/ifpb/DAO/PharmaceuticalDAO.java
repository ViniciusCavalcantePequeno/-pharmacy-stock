package DAO;

import Objects.Prescription;

public class PharmaceuticalDAO {

    StockDAO remedy;
    PrescriptionDAO acess;

    public PharmaceuticalDAO(PrescriptionDAO prescriptionDAO, StockDAO stockDAO) {
        this.acess = prescriptionDAO;
        this.remedy = stockDAO;
    }

    public void seePrescriptions() {
        for (Prescription presc : acess.getPrescriptions()) {
            System.out.println(presc);
        }
    }

    public void dispatchPrescription(int cardSUS) {
        acess.removerPrescription(cardSUS);
    }

    public void searchRemedyId(int id) {
        System.out.println(remedy.searchRemedyId(id));
    }

}
