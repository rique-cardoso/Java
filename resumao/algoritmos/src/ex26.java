import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double [] valores = new double[5];

        for(int i = 0; i < valores.length; i++){
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scan.nextDouble();
        }

        int qtd_maior5 = 0;

        for(int i = 0; i < valores.length; i++){
            if(valores[i] >= 5){
                qtd_maior5++;
            }
        }

        System.out.println("Há " + qtd_maior5 + " números maiores que 5.");

        scan.close();
    }
}
