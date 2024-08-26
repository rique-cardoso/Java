package lista_exercicio_2102;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o Principal: ");
        double principal = scan.nextDouble();

        System.out.println("Digite a taxa de juros anual: ");
        double tx_juros = scan.nextDouble()/100;

        System.out.println("Digite o número de anos: ");
        double anos = scan.nextDouble();

        double montante = Math.pow((principal * (1 + tx_juros)), anos);
        
        System.out.printf("O Montante é %.2f", montante);

        scan.close();
    }
}
