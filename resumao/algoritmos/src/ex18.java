import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos números você quer inserir? ");
        System.out.print("R: ");
        int qtd_nmrs_inseridos = scan.nextInt();

        int[] nmrs_inseridos = new int[qtd_nmrs_inseridos];

        for(int i = 0; i < qtd_nmrs_inseridos; i++){
            System.out.print((i+1) + "° número: ");
            nmrs_inseridos[i] = scan.nextInt();

        }

        int[] nmr_impares = new int[qtd_nmrs_inseridos];

        System.out.println("Números Ímpares: ");

        for(int i = 0; i < qtd_nmrs_inseridos; i++){
            if(nmrs_inseridos[i] % 2 != 0){
                nmr_impares[i] = nmrs_inseridos[i];
                System.out.println(nmr_impares[i]);
            }
        }

        scan.close();
    }
}
