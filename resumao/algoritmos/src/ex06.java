import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Valor do consumo: R$");
        double valor_consumo = scan.nextDouble();

        System.out.print("Taxa de serviço (%): ");
        double tx_servico = scan.nextDouble();

        double tot_conta = valor_consumo + (valor_consumo * (tx_servico/100));

        System.out.println("Valor total: R$" + tot_conta);

        scan.close();
    }
}
