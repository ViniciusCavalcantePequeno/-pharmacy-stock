import DAO.MedicoDAO;
import DAO.PharmaceuticalDAO;
import DAO.PrescriptionDAO;
import DAO.StockDAO;
import Objects.Prescription;
import Objects.Remedy;

public class Main {
    public static void main(String[] args) {

        PrescriptionDAO mexerReceitas = new PrescriptionDAO();
        StockDAO mexerRemedios = new StockDAO();
        Remedy dipirona = new Remedy(1, "Dipirona", 10);
        Remedy Diazepan = new Remedy(2, "Diazepan", 30);
        Prescription receita1 = new Prescription("Pedro", 2525);
        Prescription receita2 = new Prescription("Abraão", 2424);
        PharmaceuticalDAO farmaceutico = new PharmaceuticalDAO(mexerReceitas, mexerRemedios);
        MedicoDAO medico = new MedicoDAO(new Prescription("Pedro", 2525));

        mexerRemedios.addRemedy(dipirona);
        mexerRemedios.addRemedy(Diazepan);

        receita1.setReceita(dipirona);
        receita2.setReceita(Diazepan);

        mexerReceitas.addPrescription(receita1);
        mexerReceitas.addPrescription(receita2);

        farmaceutico.searchRemedyId(1);
        farmaceutico.searchRemedyId(2);

        // medico.prescribeRemedy(Diazepan);
        // medico.prescribeRemedy(dipirona);

        farmaceutico.dispatchPrescription(2424);
        farmaceutico.seePrescriptions();
    }

}
