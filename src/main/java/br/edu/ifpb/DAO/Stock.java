import java.util.ArrayList;
import java.util.List;

public class stock {
  private List<Stock> stockPharmaceutical;

  public stock() {
    stockPharmaceutical = new ArrayList<>();
  }

  public List<stock> listarstocks() {
    return stockPharmaceutical;
  }

  public void setProdutos(List<Stock> stocks) {
    this.stockPharmaceutical = stocks;
  }

  public void removerstock(Stock stock) {
    stockPharmaceutical.remove(stock);
  }
}