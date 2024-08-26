package ex03.main;

import ex03.model.Conta;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1234, 7000, 3000, "José Sabino");
        Conta conta2 = new Conta(5678, 3000, 700, "Mariano da Silva Cunha");

        conta1.deposita(20000.0);
        conta1.deposita(80000.0);
        if(conta1.saca(2500.0)){
            System.out.println("Saque realizado com sucesso.\n Saldo atual: " + conta1.getSaldo());
        }else{
            System.out.println("Saldo insuficiente ou limite diário excedido.");
        }
        if(conta1.transfere(2000.0, conta2)){
            System.out.println("Transferência realizada com sucesso.");
        }else{
            System.out.println("Saldo insuficiente ou limite diário excedido.");
        }
        System.out.println("Saldo final Conta 1: " + conta1.getSaldo() + "\nSaldo final Conta 2: " + conta2.getSaldo());
    }
}
