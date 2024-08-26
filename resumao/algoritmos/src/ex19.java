import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite G para Gasolina e A para Álcool: ");
        String tipo = scan.nextLine().toUpperCase();

        System.out.print("Litros consumidos: ");
        double litros = scan.nextDouble();

        if(tipo.equals("G")){
            System.out.printf("Conta: R$%,.2f%n", (litros * 3.3));
        }else{
            System.out.printf("Conta: R$%,.2f%n", (litros * 2.9));
        }


        scan.close();
    }
}
