package ex01.model;

public class ContaPoupanca {
    public int agencia;
    public int conta;
    public double saldo;
    public Banco banco;
    public int operacao;

    public ContaPoupanca() {
    }
    public ContaPoupanca(int agencia, int conta, double saldo, Banco banco, int operacao) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.banco = banco;
        this.operacao = operacao;
    }

    public String statusContaPoupanca(){
        return "\n----------------------------\nAgência: " + this.getAgencia() + "\nConta: " + this.getConta() + "\nSaldo: " + this.getSaldo() + "\n" + banco.status() + "\nOperação: " + this.getOperacao();
    }
    
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getConta() {
        return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Banco getBanco() {
        return banco;
    }
    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    public int getOperacao() {
        return operacao;
    }
    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    
}
