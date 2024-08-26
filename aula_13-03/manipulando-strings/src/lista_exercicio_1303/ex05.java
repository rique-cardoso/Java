package lista_exercicio_1303;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra1 = scan.nextLine();
        
        System.out.println("Digite outra palavra: ");
        String palavra2 = scan.nextLine();

        boolean palavrasIguais = palavra1.toLowerCase().equals(palavra2.toLowerCase()) ? true : false;
        System.out.println(palavrasIguais == true ? "Essas palavras são iguais" : "Essas palavras são diferentes");

        String maiorPalavra = "";

        if(palavra1.length() > palavra2.length()){
            maiorPalavra = palavra1 + " é a maior palavra";
            System.out.println(maiorPalavra);
        }else if(palavra2.length() > palavra1.length()){
            maiorPalavra = palavra2 + " é a maior palavra";
            System.out.println(maiorPalavra);
        }else{
            System.out.println("Essas palavras tem o mesmo tamanho");
        }

        System.out.println(palavra1.contains(palavra2) == true ? "A palavra 2 está contida dentro da palavra 1" : "A palavra 2 não está contida dentro da palavra 1");

        scan.close();
    }
}
