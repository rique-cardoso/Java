package ex01.model;

public class Banco {
    public String nome;
    public String cnpj;
    public Banco(){

    }
    public Banco(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
    }
    public String status(){
        return "----------------------------\n" + "Dados Bancários: " + "\n----------------------------\n" + "Nome do Banco: " + this.getNome() + "\nCNPJ: " + this.getCnpj();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
