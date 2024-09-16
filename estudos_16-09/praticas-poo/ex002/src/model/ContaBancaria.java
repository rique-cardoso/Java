package model;

public class ContaBancaria {
    private int numeroDaConta;
    private String nomeDoTitular;
    private double saldo;
    public ContaBancaria(int numeroDaConta, String nomeDoTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = 0;
    }
    public String depositar(double valor){
        if(valor > 0){
            this.setSaldo(this.getSaldo() + valor);
            return "Depósito realizado com sucesso!\nSaldo atual: " + this.getSaldo();
        }else{
            return "Valor inválido!";
        }
    }
    public String sacar(double valor){
        if(valor > 0 && valor <= this.getSaldo()){
            this.setSaldo(this.getSaldo() - valor);
            return "Saque realizado com sucesso!\nSaldo atual: " + this.getSaldo();
        }else{
            return "Valor inválido ou Saldo insuficiente.";
        }
    }
    public String emitirExtrato(){
        return "Número da conta: " + this.getNumeroDaConta()
                + "\nNome: " + this.getNomeDoTitular()
                + "\nSaldo: " + this.getSaldo();
    }
    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public String getNomeDoTitular() {
        return nomeDoTitular;
    }
    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
