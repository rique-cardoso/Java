import java.util.Scanner;

public class ex46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] valores = new int[100];
        int maior = 0;
        int menor = 0;

        for(int i = 0; i < valores.length; i++){
            System.out.print("Valor " + (i+1) + ": ");
            valores[i] = scan.nextInt();

            if(valores[i] > maior){
                maior = valores[i];
            }

            if(i == 0){
                menor = valores[i];
            }
            
            if(valores[i] < menor){
                menor = valores[i];
            }

        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        scan.close();
    }
}
