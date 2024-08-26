package lista_exercicio_2102;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");
        int preco_produto = scan.nextInt();

        System.out.println("Digite a quantidade desse produto adquirido: ");
        int qtd_produto = scan.nextInt();

        int valor_total = preco_produto * qtd_produto;

        System.out.println("O valor total é " + valor_total);
    }
}
