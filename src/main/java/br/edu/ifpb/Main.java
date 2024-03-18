import DAO.FichaDAO;
import DAO.StockDAO;
import Objects.Ficha;
import Objects.Remedio;

public class Main {
    public static void main(String[] args) throws Exception {

        FichaDAO ficha = new FichaDAO();

        Remedio soro = new Remedio(0, "soro", 25);
        
        Ficha ficha1 = new Ficha("Ramon de Oliveira Bento", 2424);

        ficha1.setReceita(soro);

        System.out.println(ficha1);
    }
}
