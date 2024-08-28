package App;

import model.*;

public class App {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João Silva", 123456789);
        PessoaJuridica pj = new PessoaJuridica("Empresa XYZ Ltda", 987654321);

        System.out.println("Pessoa Física:");
        System.out.println("Nome: " + pf.getNome());
        System.out.println("CPF: " + pf.getCpf());

        System.out.println("\nPessoa Jurídica:");
        System.out.println("Nome: " + pj.getNome());
        System.out.println("CNPJ: " + pj.getCnpj());
    }
}
