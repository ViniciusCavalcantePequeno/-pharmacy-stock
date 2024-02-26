package Mapeamento;

public class Ficha {
    
    private String nome;
    private String cartaoDoSUS;

    public Ficha(String nome, String cartaoDoSUS){
        this.nome = nome;
        this.cartaoDoSUS = cartaoDoSUS;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCartaoDoSUS() {
        return cartaoDoSUS;
    }

    public void setCartaoDoSUS(String cartaoDoSUS) {
        this.cartaoDoSUS = cartaoDoSUS;
    }

    @Override
    public String toString() {
        
    }

}
