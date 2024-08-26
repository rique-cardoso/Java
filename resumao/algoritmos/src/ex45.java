import java.util.Scanner;

public class ex45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String res = "S";
        double valor_mercadoria = 0.0;
        double soma = 0.0;
        int cont = 0;

        while (res.equals("S")) {
            System.out.println("Valor dessa mercadoria: ");
            valor_mercadoria = scan.nextDouble();
            soma += valor_mercadoria;
            cont++;

            scan.nextLine();

            System.out.println("Mais produtos? (S/N)");
            res = scan.nextLine().toUpperCase();
        }

        System.out.printf("Valor total em estoque: R$%,.2f%n", soma);
        System.out.printf("Média do valor em estoque: R$%,.2f%n", (soma / cont));

        scan.close();
    }
}
