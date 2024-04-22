package DAO;

import Objects.Prescription;
import Objects.Remedy;

public class MedicoDAO {

    private Prescription prescription;

    public MedicoDAO(Prescription prescription) {
        this.prescription = prescription;
    }

    public void prescribeRemedy(Remedy remedy) {
        prescription.setReceita(remedy);
    }

    public void setPrescriprion(String nome, int cardSUS) {
        prescription.setNome(nome);
        prescription.setCardSUS(cardSUS);
    }
}
