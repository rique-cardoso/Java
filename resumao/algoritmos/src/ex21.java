import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantidade de Kilos de morangos: ");
        double kg_morango = scan.nextDouble();

        System.out.print("Quantidade de kilos de maca: ");
        double kg_maca = scan.nextDouble();

        double valor_morango = 0.0;
        double valor_maca = 0.0; 

        if(kg_morango <= 5){
            valor_morango = 2.5 * kg_morango;
        }else{
            valor_morango = 2.2 * kg_morango;
        }

        if(kg_maca <= 5){
            valor_maca = 1.8 * kg_maca;
        }else{
            valor_maca = 1.5 * kg_maca;
        }

        double tot_kg = kg_morango + kg_maca;
        double tot_valor = valor_morango + valor_maca;

        double valor_final = tot_valor;

        if(tot_kg > 8 || tot_valor > 25.0){
            valor_final -= valor_final * 10/100;
        }

        System.out.printf("Conta: R$%,.2f%n" , valor_final);

        scan.close();
    }
}
