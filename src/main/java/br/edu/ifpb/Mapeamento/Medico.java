package Mapeamento;

public class Medico {

    private int id_medico;
    private String nome;
    private String cpf;
    private String senha;

    public Medico(int id_medico, String nome, String cpf, String senha) {
        this.id_medico = id_medico;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public int getId_medico() {
        return this.id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
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