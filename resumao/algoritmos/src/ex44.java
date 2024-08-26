import java.util.Scanner;

public class ex44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantidade de produtos em estoque: ");
        int qtd_estoque = scan.nextInt();
        double soma_valores = 0.0;

        for(int i = 0; i < qtd_estoque; i++){
            System.out.print("Valor do produto " + (i+1) + ": ");
            double valor_produto = scan.nextDouble();

            soma_valores += valor_produto;
        }

        System.out.printf("Valor total em estoque: R$%,.2f%n", soma_valores);
        System.out.printf("Média do valor em estoque: R$%,.2f%n", (soma_valores / qtd_estoque));

        scan.close();
    }
}
