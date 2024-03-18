package Objects;

public class Ficha {
    
    private String nome;
    private int cartaoDoSUS;

    public Ficha(String nome, int cartaoDoSUS){
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
}
