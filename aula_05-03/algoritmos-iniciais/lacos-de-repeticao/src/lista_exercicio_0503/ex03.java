package lista_exercicio_0503;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont = 0;

        for(int i = 1; i < 11; i++){
            System.out.println("Digite um número: ");
            int n = scan.nextInt();
            if (n < 0) {
                cont++;
            }
        }

        System.out.println("Dos números digitados, " + cont + " é (são) negativo(s).");
        scan.close();
    }
}
