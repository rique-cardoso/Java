package ex03.model;

public class Conta {
    public int numero;
    public double saldo;
    public double limite;
    public String nome;
    public Conta() {
    }
    public Conta(int numero, double saldo, double limite, String nome) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.nome = nome;
    }
    public boolean saca(Double valor){
        if(valor <= this.getSaldo() && valor <= this.getLimite()){
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }else{
            return false;
        }
    }
    public void deposita(Double valor){
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Depósito realizado com sucesso!" + "\nSaldo atual: " + this.getSaldo());
    }
    public boolean transfere(Double valor, Conta destino){
        if(valor <= this.getSaldo() && valor <= this.getLimite()){
            this.saca(valor);
            destino.deposita(valor);
            return true;
        }else{
            return false;
        }
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
