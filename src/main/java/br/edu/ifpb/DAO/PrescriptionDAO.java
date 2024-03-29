package DAO;

import java.util.ArrayList;
import java.util.List;

import Objects.Prescription;

public class PrescriptionDAO {

    private List<Prescription> stockPrescriptions;

    public PrescriptionDAO() {
        this.stockPrescriptions = new ArrayList<>();
    }

    public void addPrescription(Prescription prescription) {
        stockPrescriptions.add(prescription);
    }

    public Prescription searchPrescriptionsByCardSUS(int cardSUS) {
        for (Prescription prescription : stockPrescriptions) {
            if (prescription.getCardSUS() == cardSUS) {
                return prescription;
            }
        }
        return null;
    }

    public List<Prescription> listPrescriptions() {
        return stockPrescriptions;
    }

    public void removerPrescription(int cartaoDoSUS) {
        Prescription prescription = searchPrescriptionsByCardSUS(cartaoDoSUS);
        if (prescription != null) {
            stockPrescriptions.remove(cartaoDoSUS);
            System.out.printf("A ficha de %s foi removida", prescription.getNome());
        }
        System.out.printf("Nenhuma ficha com o numero %d foi encontrada", prescription.getCardSUS());
    }

}
