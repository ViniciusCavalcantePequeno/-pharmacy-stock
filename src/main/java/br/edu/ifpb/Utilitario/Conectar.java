package Utilitario;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Conectar {
    private static final String usuario = "PLM4";
    private static final String senha = "root";
    private static final String url = "jdbc:mysql://localhost/IFarma";

    public static Connection getConectar(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, senha)
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados" + ex.getMessage());
        }

        return con;
    }
