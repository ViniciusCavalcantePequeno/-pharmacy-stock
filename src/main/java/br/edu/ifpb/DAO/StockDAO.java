package DAO;

import java.util.ArrayList;
import java.util.List;

import Objects.Remedy;

public class StockDAO {

    private List<Remedy> estoque;

    public StockDAO(){
        this.estoque = new ArrayList<>();
    }

    public void adicionarItem(Remedy remedio) {
        estoque.add(remedio);
    }
    
    public void removerItemPorId(int id) {
        Remedy remedios = buscarRemedioPorId(id);
        if (remedios != null) {
            estoque.remove(id);
        }
    }

    public void atualizarQuantidade(int id, int novaQuantidade) {
        Remedy remedios = buscarRemedioPorId(id);
        if (remedios != null) {
            remedios.setQuantidade(novaQuantidade);
        }
    }
    
    public Remedy buscarRemedioPorId(int id) {
        for (Remedy remedio : estoque) {
            if (remedio.getId() == id) {
                return remedio;
            }
        }
        return null;
    }

    public List<Remedy> listarRemedios() {
        return estoque;
    }


    
}