package ex01.main;

import ex01.model.Banco;
import ex01.model.ContaPoupanca;
import ex01.model.Pessoa;

public class Main{
    public static void main(String[]args){
        Banco banco = new Banco("Banco Banqueiro", "41.466.018/0001-60");
        ContaPoupanca contaPoupanca = new ContaPoupanca(1234, 40000, 4500.0, banco, 77);
        Pessoa pessoa = new Pessoa("Yuji Itadori", "123.456.789-10", contaPoupanca);

        System.out.println(pessoa.status());
    }
}