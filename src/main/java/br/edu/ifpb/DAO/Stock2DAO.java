package DAO;

import java.util.ArrayList;
import java.util.List;

import Objects.Remedy;

public class StockDAO {

    private List<Remedy> stock;

    public StockDAO(){
        this.stock = new ArrayList<>();
    }

    public void addRemedy(Remedy remedy) {
        stock.add(Remedy);
    }
    
    public void removerItem(int id) {
        Remedy remedy = searchRemedyId(id);
        if (remedy != null) {
            stock.remove(id);
        }
    }

    public void atualizarQuantity(int id, int newQuantity) {
        Remedy remedy = searchRemedyId(id);
        if (remedy != null) {
            remedy.setQuantity(newQuantity);
        }
    }
    
    public Remedy searchRemedyPorId(int id) {
        for (Remedy remedy : stock) {
            if (remedy.getId() == id) {
                return remedy;
            }
        }
        return null;
    }

    public List<Remedy> listRemedy() {
        return stock;
    }


    
}