import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double [] valores = new double[10];
        double soma_valores = 0.0;

        for(int i = 0; i < valores.length; i++){
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scan.nextDouble();
            soma_valores += valores[i];
        }

        System.out.println("A média dos valores digitados é " + (soma_valores / valores.length));



        scan.close();
    }
}
