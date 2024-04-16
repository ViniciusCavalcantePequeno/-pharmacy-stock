import Objects.Prescription;
import Objects.Remedy;

public class Main {
    public static void main(String[] args) {

        Prescription receita = new Prescription("Pedro", 2424);
        Remedy dipirona = new Remedy(00, "Dipirona", 10);

        receita.setReceita(dipirona);

        System.out.println(receita);
    }
}
