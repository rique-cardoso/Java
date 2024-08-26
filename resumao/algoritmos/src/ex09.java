import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Número de carros vendidos: ");
        double n_carros = scan.nextDouble();

        System.out.print("Valor total de vendas: ");
        double tot_vendas = scan.nextDouble();

        System.out.print("Salário fixo: ");
        double salario_fixo = scan.nextDouble();

        System.out.print("Valor recebido por carro: ");
        double comiss_carro = scan.nextDouble();

        System.out.print("Comissão pelo faturamento total: ");
        double comissao = scan.nextDouble();

        System.out.printf("Salário final: R$%,.2f%n", (salario_fixo + (n_carros * comiss_carro) + (tot_vendas * (comissao / 100.0))));

        scan.close();
    }
}
