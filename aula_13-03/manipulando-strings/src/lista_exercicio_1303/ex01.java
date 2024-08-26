package lista_exercicio_1303;

import java.util.Scanner;

public class ex01 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite alguma coisa: ");
        String entrada = scan.nextLine();
        String[] texto = entrada.split("\\s+");
        System.out.println("O texto digitado contém " + entrada.length() + " caracteres");
        System.out.println("O texto digitado contém " + texto.length + " palavras");
        scan.close();

    }
}
