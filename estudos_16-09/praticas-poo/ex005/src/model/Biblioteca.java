package model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    public Biblioteca() {
        livros = new ArrayList<>();
    }
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
    public void removerLivro(Livro livro){
        livros.remove(livro);
    }
    public void exibirLivros(){
        for (Livro livro : livros) {
            livro.exibirInfo();
            System.out.println("================================");
        }
    }
    public void buscarLivroPorTitulo(String titulo){
        boolean encontrou = false;
        for (Livro livro : livros) {
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                livro.exibirInfo();
                encontrou = true;
                break;
            }
        }
        if(!encontrou){
            System.out.println("Livro indisponível.");
        }
    }
    public void buscarLivroPorAutor(String autor){
        boolean encontrou = false;
        for (Livro livro : livros) {
            if(livro.getAutor().equalsIgnoreCase(autor)){
                livro.getTitulo();
                System.out.println("-----------------------------------");
                encontrou = true;
            }
        }
        if(!encontrou){
            System.out.println("Livro indisponível.");
        }
    }
    public void buscarLivroPeloAno(int ano){
        boolean encontrou = false;
        for (Livro livro : livros) {
            if(livro.getAnoDePublicacao() == ano){
                livro.getTitulo();
                System.out.println("-----------------------------------");
                encontrou = true;
            }
        }
        if(!encontrou){
            System.out.println("Nenhum livro encontrado neste ano.");
        }
    }
    public void buscarLivroPeloGenero(String genero){
        boolean encontrou = true;
        for (Livro livro : livros) {
            if(livro.getGenero().equalsIgnoreCase(genero)){
                livro.getTitulo();
                System.out.println("-----------------------------------");
                encontrou = true;
            }
        }
        if(!encontrou){
            System.out.println("Ainda não há nenhum livro deste gênero.");
        }
    }
}
