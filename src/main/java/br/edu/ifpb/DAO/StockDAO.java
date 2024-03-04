package DAO;

import java.util.ArrayList;
import java.util.List;

import Mapeamento.Remedios;

public class StockDAO {

    private List<Remedios> estoque;

    public StockDAO(){
        this.estoque = new ArrayList<>();
    }

    public void adicionarItem(Remedios remedio) {
        estoque.add(remedio);
    }

    public Remedios buscarRemedioPorId(int id) {
        for (Remedios remedio : estoque) {
            if (remedio.getId() == id) {
                return remedio;
            }
        }
        return null;
    }

    public List<Remedios> listarRemedios() {
        return estoque;
    }

    public void atualizarQuantidade(int id, int novaQuantidade) {
        Remedios remedios = buscarRemedioPorId(id);
        if (remedios != null) {
            remedios.setQuantidade(novaQuantidade);
        }
    }

    public void removerItem(int id) {
        Remedios remedios = buscarRemedioPorId(id);
        if (remedios != null) {
            estoque.remove(id);
        }
    }
    
}