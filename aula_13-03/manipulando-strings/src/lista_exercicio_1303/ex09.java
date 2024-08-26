package lista_exercicio_1303;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma sequência de números separados por vírgulas:");
        String entrada = scanner.nextLine();

        String[] numerosString = entrada.split(",");

        double soma = 0;
        int contador = 0;

        for (int i = 0; i < numerosString.length; i++) {
            String numeroLimpo = numerosString[i].replace(" ", "");

            if (!numeroLimpo.isEmpty()) {
                double numero = Double.parseDouble(numeroLimpo);
                soma += numero;
                contador++;
            }
        }

        double media = soma / contador;

        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
