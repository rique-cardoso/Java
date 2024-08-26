package ex01.model;

public class Pessoa {
    public String nome;
    public String cpf;
    public ContaPoupanca contaPoupanca;
    public Pessoa() {
    }
    public Pessoa(String nome, String cpf, ContaPoupanca contaPoupanca) {
        this.nome = nome;
        this.cpf = cpf;
        this.contaPoupanca = contaPoupanca;
    }
    public String status(){
        return "----------------------------\n" + "Titular da Conta: " + "\n----------------------------\n" + "Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\n----------------------------" + "\nConta Poupança: " + contaPoupanca.statusContaPoupanca();
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
    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }
    public void setContaPoupanca(ContaPoupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }
}
