package lista_exercicio_0503;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 0;
        int soma = 0;

        for(int i = 1; i < 11; i++){
            System.out.println("Digite um número: ");
            n = scan.nextInt();
            if(n < 40){
                soma += n;
            }
        }

        System.out.println("O valor da soma dos números inferiores a 40 é " + soma);

        scan.close();
    }
}
