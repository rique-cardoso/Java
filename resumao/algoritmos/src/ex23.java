import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = scan.nextLine();

        System.out.print("Quantidade: ");
        double qtd = scan.nextDouble();

        System.out.print("Preço unitário: R$");
        double preco = scan.nextDouble();

        double tot_valor = qtd * preco;
        double desconto = 0.0;

        System.out.println(nome);
        System.out.printf("Valor R$%,.2f%n " , tot_valor);

        if(qtd <= 5){
            tot_valor -= tot_valor * 2 / 100;
            desconto = tot_valor * 2 / 100;
        }else if(qtd > 5 && qtd <= 10){
            tot_valor -= tot_valor * 3 / 100;
            desconto = tot_valor * 3 / 100;
        }else{
            tot_valor -= tot_valor * 5 / 100;
            desconto = tot_valor * 5 / 100;
        }

        System.out.printf("Desconto: R$%,.2f%n" , desconto);
        System.out.printf("Total a pagar: R$%,.2f%n" , tot_valor );




        scan.close();
    }
}
