package DAO;

import java.util.ArrayList;
import java.util.List;

import Objects.Remedio;

public class StockDAO {

    private List<Remedio> estoque;

    public StockDAO(){
        this.estoque = new ArrayList<>();
    }

    public void adicionarItem(Remedio remedio) {
        estoque.add(remedio);
    }
    
    public void removerItemPorId(int id) {
        Remedio remedios = buscarRemedioPorId(id);
        if (remedios != null) {
            estoque.remove(id);
        }
    }

    public void atualizarQuantidade(int id, int novaQuantidade) {
        Remedio remedios = buscarRemedioPorId(id);
        if (remedios != null) {
            remedios.setQuantidade(novaQuantidade);
        }
    }
    
    public Remedio buscarRemedioPorId(int id) {
        for (Remedio remedio : estoque) {
            if (remedio.getId() == id) {
                return remedio;
            }
        }
        return null;
    }

    public List<Remedio> listarRemedios() {
        return estoque;
    }


    
}