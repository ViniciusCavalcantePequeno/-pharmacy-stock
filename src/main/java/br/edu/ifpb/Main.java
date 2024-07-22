import java.util.Scanner;

import Validators.NameDoctorValidator;
import Validators.PasswordValidator;
import DAO.MedicoDAO;
import DAO.PharmaceuticalDAO;
import DAO.PrescriptionDAO;
import Objects.Prescription;
import Objects.Remedy;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);

        boolean processing = true;
        
        while(processing){
            System.out.println("------Bem vindo------");
            System.out.println("1- Medico");
            System.out.println("2- Farmaceutico");
            System.out.println("3- Sair");
            System.err.println();

            System.out.println("\nOpção: ");
            String opc = reader.nextLine();
            System.out.println();

            switch (opc) {
                case "1":
                    System.out.println();
                    System.out.printf("Digite sua senha: ");
                    int senhaMedico = reader.nextInt();
                    if(NameDoctorValidator && PasswordValidator){
                        boolean running = true;
                        while(running){
                            System.out.println("-----Bem vindo-----");
                            System.out.println("1- Prescrever receita");
                            System.out.println("2- procurar remedio por ID");
                            System.out.println("3- Sair");
                            System.out.println();
    
                            System.out.println("\nOpção: ");
                            String opcao = reader.nextLine();
                            switch (opcao) {
                                case "1":
                                    
                                    break;
                                
                                case "2":
    
                                    break;
    
                                case "3":
                                    System.out.println("Sistema encerrado.");
                                    running = false;
                                    processing = false;
                                    break;
                                default:
                                    System.out.println("Opcão invalida, tente novamente.");
                                    break;
                            }
                        }
                    }
                    break;
                case "2":
                    System.out.println();
                    boolean working = true;
                    while(working){

                        System.out.println("-----Bem vindo-----");
                        System.out.println("1- Ver fichas");
                        System.out.println("2- Dispachar ficha");
                        System.out.println("3- Procurar remdeio por ID");
                        System.out.println("4- Sair");
                        System.out.println();

                        System.out.println("\nOpção: ");
                        String opcao = reader.nextLine();
                        switch (opcao) {
                            case "1":
                                
                                break;
                            
                            case "2":

                                break;

                            case "3":

                                break;

                            case "4":
                                System.out.println("Sistema encerrado.");
                                running = false;
                                processing = false;
                                break;
                            default:
                                System.out.println("Opcão invalida, tente novamente.");
                                break;
                    }
                    break;
                }
                default:
                    System.out.println("Opcão invalida, tente novamente.");
                    break;
        }
    }
}
}