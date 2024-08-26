import java.util.Scanner;

public class ex16 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Valor do produto: ");
        double valor_produto = scan.nextDouble();

        System.out.print("Porcentagem de desconto: ");
        double porcentagem_desconto = scan.nextDouble();

        System.out.printf("Valor final: R$%,.2f%n" , (valor_produto - (valor_produto * porcentagem_desconto / 100)));

        scan.close();
    }
}
