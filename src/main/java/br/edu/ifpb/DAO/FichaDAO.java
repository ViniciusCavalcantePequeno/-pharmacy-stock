package DAO;

import java.util.ArrayList;
import java.util.List;

import Objects.Record;

public class FichaDAO {

    private List<Record> fichas;

    public FichaDAO() {
        this.fichas = new ArrayList<>();
    }

    public void adicionarFicha(Record ficha) {
        fichas.add(ficha);
    }

    public Record buscarFichaPorCartaoDoSUS(int cartaoDoSUS) {
        for (Record ficha : fichas) {
            if (ficha.getCartaoDoSUS() == cartaoDoSUS) {
                return ficha;
            }
        }
        return null;
    }

    public List<Record> listarFichas() {
        return fichas;
    }

    public void removerFicha(int cartaoDoSUS) {
        Record ficha = buscarFichaPorCartaoDoSUS(cartaoDoSUS);
        if (ficha != null) {
            fichas.remove(cartaoDoSUS);
        }
    }

}
