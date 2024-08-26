package lista_exercicio_0503;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 0;
        int soma = 0;

        for(int i = 0; i < 11; i++){
            System.out.println("Digite um número: ");
            n = scan.nextInt();
            soma += n;
        }

        System.out.println("A soma dos números digitados é " + soma);

        scan.close();
    }
}
