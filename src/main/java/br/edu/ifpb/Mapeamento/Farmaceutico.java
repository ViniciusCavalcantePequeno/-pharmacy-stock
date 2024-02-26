package Mapeamento;

public class Farmaceutico {
    
    private int id_farmaceutico;
    private String nome;
    private String cpf;
    private String senha;
    
    public Farmaceutico(int id_farmaceutico, String nome, String cpf, String senha) {
        this.id_farmaceutico = id_farmaceutico;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }
    public int getId_farmaceutico() {
        return id_farmaceutico;
    }

    public void setId_farmaceutico(int id_farmaceutico) {
        this.id_farmaceutico = id_farmaceutico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
