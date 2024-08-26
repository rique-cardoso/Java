import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Número da Conta: ");
        int num_conta = scan.nextInt();

        System.out.print("Saldo atual: ");
        double saldo_atual = scan.nextDouble();

        System.out.print("Débito: ");
        double debito = scan.nextDouble();

        System.out.print("Crédito: ");
        double credito = scan.nextDouble();

        double novo_saldo = saldo_atual - debito + credito;

        System.out.println("Conta " + num_conta + ": ");
        System.out.printf("Novo saldo: R$%,.2f%n", novo_saldo);
        if (novo_saldo >= 0) {
            System.out.println("Saldo positivo!");
        }else{
            System.out.println("Saldo negativo!");
        }

        scan.close();
    }
}
