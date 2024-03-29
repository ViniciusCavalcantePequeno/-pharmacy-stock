package DAO;

import Objects.Prescription;
import Objects.Remedy;

public class MedicoDAO {

    private StockDAO remedy;
    private Prescription prescription;

    public void prescribleMedicine(Remedy remedy) {
        prescription.setReceita(remedy);
    }

    public void searchRemedyId(int id) {
        System.out.println(remedy.searchRemedyId(id));
    }

}