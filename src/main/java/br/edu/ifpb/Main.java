import DAO.PrescriptionDAO;
import DAO.StockDAO;
import Objects.Prescription;
import Objects.Remedy;

public class Main {
    public static void main(String[] args) throws Exception {

        PrescriptionDAO ficha = new PrescriptionDAO();

        Remedy soro = new Remedy(0, "soro", 25);
        Remedy dipirona = new Remedy(1, "Dipirona", 25);

        Prescription ficha1 = new Prescription("Ramon de Oliveira Bento", 2424);

        ficha1.setReceita(soro);
        ficha1.setReceita(dipirona);

        System.out.println(ficha1);

        ficha.addPrescription(ficha1);
        System.out.println(ficha.listPrescriptions());
    }
}
