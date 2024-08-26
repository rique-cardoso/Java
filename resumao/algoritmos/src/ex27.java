import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double [] valores = new double[10];

        for(int i = 0; i < valores.length; i++){
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scan.nextDouble();
        }

        int qtd_negativos = 0;

        for(int i = 0; i < valores.length; i++){
            if(valores[i] < 0){
                qtd_negativos++;
            }
        }

        System.out.println("Há " + qtd_negativos + " números negativos.");

        scan.close();
    }
}
