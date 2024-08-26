package ex02.model;

public class Endereco {
    public String logradouro;
    public int numero;
    public String complemento;
    public String bairro;
    public String cidade;
    public int cep;

    public Endereco() {
    }

    public Endereco(String logradouro, int numero, String complemento, String bairro, String cidade, int cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String getStatusEndereco(){
        return "Logradouro: " + this.getLogradouro() + "\nNúmero: " + this.getNumero() + "\nComplemento: " + this.getComplemento() + "\nBairro: " + this.getBairro() + "\nCidade: " + this.getCidade() + "CEP: " + this.getCep();
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    
}
