import java.util.Scanner;

public class ex49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] precos = new double[5];

        double maior = 0.0;
        double media = 0.0;

        for(int i = 0; i < precos.length; i++){
            System.out.print("Código do produto " + (i+1) + ": ");
            scan.nextLine();
            System.out.print("Preço: ");
            precos[i] = scan.nextDouble();
            scan.nextLine();

            if(precos[i] > maior){
                maior = precos[i];
            }

            media += precos[i];
        }

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (media / precos.length));

        scan.close();
    }
}
