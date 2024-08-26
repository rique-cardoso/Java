package lista_exercicio_0503;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota = 0;
        int somaMedia = 0;

        for(int i = 1; i < 11; i++){
            System.out.println("Digite um número: ");
            nota = scan.nextInt();

            somaMedia += nota;
        }

        int media = somaMedia / 10;

        System.out.println("Sua média é " + media);

        scan.close();

    }
}
