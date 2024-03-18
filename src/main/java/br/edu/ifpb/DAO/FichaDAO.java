package DAO;

import java.util.ArrayList;
import java.util.List;

import Objects.Ficha;

public class FichaDAO {

    private List<Ficha> fichas;

    public FichaDAO() {
        this.fichas = new ArrayList<>();
    }

    public void adicionarFicha(Ficha ficha) {
        fichas.add(ficha);
    }

    public Ficha buscarFichaPorCartaoDoSUS(int cartaoDoSUS) {
        for (Ficha ficha : fichas) {
            if (ficha.getCartaoDoSUS() == cartaoDoSUS) {
                return ficha;
            }
        }
        return null;
    }

    public List<Ficha> listarFichas() {
        return fichas;
    }

    public void removerFicha(int cartaoDoSUS) {
        Ficha ficha = buscarFichaPorCartaoDoSUS(cartaoDoSUS);
        if (ficha != null) {
            fichas.remove(cartaoDoSUS);
        }
    }

}
