import DAO.MedicoDAO;
import DAO.PharmaceuticalDAO;
import DAO.PrescriptionDAO;
import Objects.Prescription;
import Objects.Remedy;

public class Main {
    public static void main(String[] args) throws Exception {

        PrescriptionDAO ficha = new PrescriptionDAO();
        MedicoDAO medico = new MedicoDAO();
        PharmaceuticalDAO farma = new PharmaceuticalDAO();

        Remedy soro = new Remedy(0, "soro", 25);
        Remedy dipirona = new Remedy(1, "Dipirona", 25);

        Prescription ficha1 = new Prescription("Ramon de Oliveira Bento", 2424);

        ficha.addPrescription(ficha1);

        System.out.println(ficha1);

        // farma.dispatchPrescription(2424); // Não está funcionando
        farma.seePrescriptions();   
    }
}
