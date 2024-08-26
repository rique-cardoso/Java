package lista_exercicio_1303;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        System.out.println("Digite a letra que deseja contar:");
        char letra = scanner.next().charAt(0);

        letra = Character.toLowerCase(letra);

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);
            if (Character.toLowerCase(caractere) == letra) {
                contador++;
            }
        }

        System.out.println("O número de ocorrências da letra '" + letra + "' na frase é: " + contador);

        scanner.close();
    }
}