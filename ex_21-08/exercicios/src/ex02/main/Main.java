package ex02.main;

import ex02.model.Pessoa;
import ex02.model.Endereco;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Jardim das Flores", 777, "Depois do balde de lixo", "GR City", "CyberCity", 7988099);
        Pessoa pessoa = new Pessoa("Henrique Prates Cardoso", 12346, endereco);

        System.out.println(pessoa.getStatusPessoa());
    }
}
