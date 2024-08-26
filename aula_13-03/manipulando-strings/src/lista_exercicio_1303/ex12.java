package lista_exercicio_1303;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine().toLowerCase();

        boolean[] letrasPresentes = new boolean[26];

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if ('a' <= c && c <= 'z') {
                letrasPresentes[c - 'a'] = true;
            }
        }

        boolean pangrama = true;
        for (boolean presente : letrasPresentes) {
            if (!presente) {
                pangrama = false;
                break;
            }
        }

        if (pangrama) {
            System.out.println("A frase é um pangrama.");
        } else {
            System.out.println("A frase não é um pangrama.");
        }

        scanner.close();
    }
}
