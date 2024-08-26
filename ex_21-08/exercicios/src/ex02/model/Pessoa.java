package ex02.model;

public class Pessoa{
    public String nome;
    public int cpf;
    private Endereco endereco;
    public Pessoa() {
    }
    public Pessoa(String nome, int cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    public String getStatusPessoa(){
        return "Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\n---------------\nEndereço:\n" + endereco.getStatusEndereco();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}