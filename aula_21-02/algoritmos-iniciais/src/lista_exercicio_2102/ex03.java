package lista_exercicio_2102;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um valor em Real (R$): ");
        float valor_real = scan.nextFloat();

        float conversao = valor_real / 5.05F;

        System.out.printf("O valor equivalente em Real é R$%.2f", conversao);
    }
}
