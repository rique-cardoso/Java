package model;

public class ContaBanco{
    //Atributos:
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private float saldo;
    private boolean status;
    //Métodos personalizados:
    public void estadoAtual(){
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Nome: " + this.getDonoConta());
        System.out.println("Tipo da conta: " + this.getTipoConta());
        System.out.println("Status: " + this.isStatus());
        System.out.println("Saldo atual: " + this.getSaldo());
    }
    public void abrirConta(String t){
        this.setTipoConta(t.toUpperCase());
        this.setStatus(true);
        if(this.getTipoConta().equals("CC")){
            this.setSaldo(50);
        }else{
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro.");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta em débito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }

    }
    public void depositar(float d){
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + d);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDonoConta() + ".\nSeu saldo agora é de " + this.getSaldo());
        }else{
            System.out.println("Esta conta está inativa, ative-a primeiro.");
        }
    }
    public void sacar(float s){
        if(this.isStatus()){
            if(s <= this.getSaldo()){
                this.setSaldo(this.getSaldo() - s);
                System.out.println("Saque realizado com sucesso na conta de " + this.getDonoConta() + ".\nSeu saldo agora é de " + this.getSaldo());
            }else{
                System.out.println("Saldo insuficiente.");
            }
        }else{
            System.out.println("Esta conta está inativa, ative-a primeiro.");
        }
    }
    public void pagarMensalidade(){
        if(this.getTipoConta().equals("CC") && this.getSaldo() >= 12){
            this.setSaldo(this.getSaldo() - 12);
            System.out.println("Mensalidade paga com sucesso na conta de " + this.getDonoConta() + ".\nSeu saldo agora é de " + this.getSaldo());
        }else if(this.getTipoConta().equals("CP") && this.getSaldo() >= 50){
            System.out.println("Mensalidade paga com sucesso na conta de " + this.getDonoConta() + ".\nSeu saldo agora é de " + this.getSaldo());
        }else{
            System.out.println("Saldo insuficiente ou você não possui uma conta.");
        }
    }
    //Métodos especiais:
    //Construtor:
    public ContaBanco(){
        //Deve ter o mesmo nome da classe
        this.setSaldo(0);
        this.setStatus(false);
    }
    //Getters and Setters:
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    public String getDonoConta() {
        return donoConta;
    }
    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    
}