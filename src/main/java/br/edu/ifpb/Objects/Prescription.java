package Objects;

import java.util.ArrayList;

public class Prescription {

    private String nome;
    private ArrayList<Remedy> DoctorsPrescription;
    private int cardSUS;

    public Prescription(String nome, int cardSUS) {
        this.DoctorsPrescription = new ArrayList<>();
        this.nome = nome;
        this.cardSUS = cardSUS;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCardSUS() {
        return cardSUS;
    }

    public void setCardSUS(int cardSUS) {
        this.cardSUS = cardSUS;
    }

    public void setReceita(Remedy receita) {
        DoctorsPrescription.add(receita);
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nCartao SUS: " + cardSUS + "\nRemedio(s): " + DoctorsPrescription + "\n";
    }
}