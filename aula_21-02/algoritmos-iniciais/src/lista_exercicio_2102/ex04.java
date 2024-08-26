package lista_exercicio_2102;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int soma = 0;

        for(int i = 1; i < 4; i++){
            System.out.println("Valor " + i + ": ");
            int valor = scan.nextInt();

            soma = soma + valor;
        }

        System.out.println("A média dos números inseridos é " + soma / 3);
    }
}
