package main;

import model.Pessoa;
import model.Emprestimo;
import model.Livro;

public class Main {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Henrique";
        pessoa.cpf = 123456l;
        pessoa.email = "henrique.prates.br@gmail.com";
        
        Livro livro = new Livro();
        livro.titulo = "História do pensamento ocidental";
        livro.autor = "Bertrand Russell";
        livro.editora = "Deitel";

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.dtInicio = "06/08/2024";
        emprestimo.dtFim = "13/08/2024";
        emprestimo.livro = livro;
        emprestimo.pessoa = pessoa;

        emprestimo.exibirDados();

    }
}
