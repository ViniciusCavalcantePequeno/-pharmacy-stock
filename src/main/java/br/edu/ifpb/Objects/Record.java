package Objects;

import java.util.ArrayList;

public class Record {

    private String nome;
    private ArrayList<Remedy> receitaDoMedico;
    private int cardSUS;

    public Record(String nome, int cardSUS) {
        this.receitaDoMedico = new ArrayList<>();
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
        receitaDoMedico.add(receita);
    }

    @Override
    public String toString() {
        return "Nome:" + nome + " Cartão do sus:" + cardSUS + " Remedio(s):" + receitaDoMedico + "\n";
    }
}
