import java.util.Scanner;

public class ex48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantidade: ");
        int qtd = scan.nextInt();

        int [] valores = new int[qtd];

        int maior = 0;
        int media = 0;

        for(int i = 0; i < valores.length; i++){
            System.out.print("Valor " + (i+1) + ": ");
            valores[i] = scan.nextInt();

            if(valores[i] > maior){
                maior = valores[i];
            }

            media += valores[i];
        }

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (media / valores.length));

        scan.close();
    }
}
