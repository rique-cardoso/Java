package app;
import model.*;
public class App {
    public static void main(String[] args) {
        Headseat phone = new Headseat("JBLTUNE720", "JBL", 400.00);
        IProduto livro = new Livro("História do Pensamento Ocidental", "Editora Nova Fronteira", 130.00);
        System.out.println("Phone:\n" + phone.getMarca() + "\n" + phone.getNome() + "\n" + phone.getPreco());
        System.out.println("Livro:\n" + livro.getMarca() + "\n" + livro.getNome() + "\n" + livro.getPreco());
    }
}
