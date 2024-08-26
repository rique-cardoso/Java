import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double [] valores = new double[30];
        double soma_valores = 0.0;

        for(int i = 0; i < valores.length; i++){
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scan.nextDouble();
            if(valores[i] > 0){
                soma_valores += valores[i];
            }
        }

        System.out.println("Soma dos valores positivos digitados: " + soma_valores);
        
        scan.close();
    }
}
