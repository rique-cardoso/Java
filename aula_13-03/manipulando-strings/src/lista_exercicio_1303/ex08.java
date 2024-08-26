package lista_exercicio_1303;

import java.util.Scanner;

public class ex08 {
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite uma palavra:");
        String palavra = scan.nextLine();
        

        System.out.println(palavra.toUpperCase().replace("A", "X").replace("E", "X").replace("I", "X").replace("O", "X").replace("U", "X"));

        scan.close();
    }
}
