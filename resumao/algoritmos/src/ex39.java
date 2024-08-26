import java.util.Scanner;

public class ex39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] notas = new int[2];
        boolean verificardor = true;
        int soma_notas = 0;

        for(int i = 0; i < 2; i++){
            while(verificardor == true){
                System.out.print("Nota " + (i+1) + ": ");
                notas[i] = scan.nextInt();
                verificardor = false;

                if(notas[i] < 0 || notas[i] > 10){
                    verificardor = true;
                }
            }
            soma_notas += notas[i];
            verificardor = true;
        }

        System.out.println("Média: " + (soma_notas / notas.length));

        scan.close();
    }
}
