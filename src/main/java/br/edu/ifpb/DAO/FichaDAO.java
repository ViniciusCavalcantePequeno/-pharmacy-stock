package DAO;

import java.util.ArrayList;
import java.util.List;

import Mapeamento.Ficha;

public class FichaDAO {

    private List<Ficha> estoque;

    public FichaDAO() {
        this.estoque = new ArrayList<>();
    }

    public void adicionarFicha(Ficha ficha) {
        estoque.add(ficha);
    }

    public Ficha buscarFichaPorCartaoDoSUS(String cartaoDoSUS) {
        for (Ficha ficha : estoque) {
            if (ficha.getCartaoDoSUS() == cartaoDoSUS) {
                return ficha;
            }
        }
        return null;
    }

    public List<Ficha> listarFichas() {
        return estoque;
    }

    public void removerFicha(String cartaoDoSUS) {
        Ficha ficha = buscarFichaPorCartaoDoSUS(cartaoDoSUS);
        if (ficha != null) {
            estoque.remove(cartaoDoSUS);
        }
    }

}
