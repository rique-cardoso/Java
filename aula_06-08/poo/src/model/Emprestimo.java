package model;

public class Emprestimo {
    public String dtInicio;
    public String dtFim;
    public Pessoa pessoa;
    public Livro livro;

    public void exibirDados(){
        System.out.println("Data de início: " + dtInicio);
        System.out.println("Data final: " + dtFim);
        System.out.println("Nome do livro: " + livro.titulo);
        System.out.println("Nome da pessoa: " + pessoa.nome);
    }
}
