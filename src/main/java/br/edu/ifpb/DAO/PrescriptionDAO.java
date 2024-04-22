package DAO;

import java.util.ArrayList;
import java.util.List;

import Exceptions.PrescriptionNotFoundException;
import Objects.Prescription;

public class PrescriptionDAO {

    private List<Prescription> stockPrescriptions;

    public PrescriptionDAO() {
        this.stockPrescriptions = new ArrayList<>();
    }

    public void addPrescription(Prescription prescription) {
        this.stockPrescriptions.add(prescription);
    }

    public Prescription searchPrescriptionsByCardSUS(int cardSUS) {
        for (Prescription prescription : this.stockPrescriptions) {
            if (prescription.getCardSUS() == cardSUS) {
                return prescription;
            }
        }
        return null;
    }

    public List<Prescription> getPrescriptions() {
        return this.stockPrescriptions;
    }

    public void removerPrescription(int cardSUS) {
        Prescription prescription = searchPrescriptionsByCardSUS(cardSUS);
        try {
            if (prescription != null) {
                this.stockPrescriptions.remove(prescription);
                System.out.printf("A ficha de %s foi removida\n", prescription.getNome());
            }
        } catch (PrescriptionNotFoundException PrescriptionNotFoundException) {
            System.out.printf("Nenhuma ficha com o numero %d foi encontrada\n", cardSUS);
        }
    }

}