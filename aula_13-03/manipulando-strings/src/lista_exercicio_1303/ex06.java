package lista_exercicio_1303;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scan.nextLine();

        String[] fraseDividida = frase.split("\\s+");

        for (String string : fraseDividida) {
            System.out.println(string);
        }

        scan.close();
    }
}
