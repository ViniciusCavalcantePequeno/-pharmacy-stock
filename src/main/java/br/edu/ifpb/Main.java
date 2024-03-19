import DAO.FichaDAO;
import DAO.StockDAO;
import Objects.Record;
import Objects.Remedy;

public class Main {
    public static void main(String[] args) throws Exception {

        FichaDAO ficha = new FichaDAO();

        Remedy soro = new Remedy(0, "soro", 25);
        Remedy dipirona = new Remedy(1, "Dipirona", 25);

        Record ficha1 = new Record("Ramon de Oliveira Bento", 2424);

        ficha1.setReceita(soro);
        ficha1.setReceita(dipirona);

        System.out.println(ficha1);

        ficha.adicionarFicha(ficha1);
        System.out.println(ficha.listarFichas());
    }
}
