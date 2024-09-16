package app;
import model.*;
public class App {
    public static void main(String[] args) throws Exception {
        Livro livro1 = new Livro("História do Pensamento Ocidental", "Bertrand Russell", 2017, "Filosofia");
        Livro livro2 = new Livro("O Homem Duplo", "Philip K. Dick", 2016, "Suspense");
        Livro livro3 = new Livro("Manifesto do Partido Comunista", "Karl Marx", 2021, "Sociologia");
        Livro livro4 = new Livro("História da Filosofia Ocidental", "Bertrand Russell", 2017, "Filosofia");
        Biblioteca bibliotecaIFB = new Biblioteca();
        bibliotecaIFB.exibirLivros();
        bibliotecaIFB.adicionarLivro(livro1);
        bibliotecaIFB.adicionarLivro(livro2);
        bibliotecaIFB.adicionarLivro(livro3);
        bibliotecaIFB.adicionarLivro(livro4);
        bibliotecaIFB.exibirLivros();
        bibliotecaIFB.buscarLivroPeloAno(2017);
        bibliotecaIFB.buscarLivroPeloGenero("Filosofia");
        bibliotecaIFB.buscarLivroPorAutor("Bertrand Russell");
        bibliotecaIFB.buscarLivroPorTitulo("Manifesto do partido comunista");
        bibliotecaIFB.buscarLivroPeloGenero("Suspense");
        bibliotecaIFB.removerLivro(livro3);
        bibliotecaIFB.exibirLivros();
    }
}
