package Objects;

import java.util.ArrayList;

public class Ficha {
    
    private String nome;
    private ArrayList<Remedio> receitaDoMedico;
    private int cartaoDoSUS;

    public Ficha(String nome, int cartaoDoSUS){
        this.receitaDoMedico = new ArrayList<>();
        this.nome = nome;
        this.cartaoDoSUS = cartaoDoSUS;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCartaoDoSUS() {
        return cartaoDoSUS;
    }

    public void setCartaoDoSUS(int cartaoDoSUS) {
        this.cartaoDoSUS = cartaoDoSUS;
    }
    
    public void setReceita(Remedio receita) {
        receitaDoMedico.add(receita);
    }
}
