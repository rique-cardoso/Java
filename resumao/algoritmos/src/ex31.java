import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double [] valores = new double[10];

        for(int i = 0; i < valores.length; i++){
            System.out.print("Digite o lado do quadrado " + (i + 1) + ": ");
            valores[i] = scan.nextDouble();

            System.out.println("A área deste quadrado é: " + valores[i] * valores[i]);
        }

        scan.close();
    }
}
