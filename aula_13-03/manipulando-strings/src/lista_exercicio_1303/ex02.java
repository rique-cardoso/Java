package lista_exercicio_1303;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um texto:");
        String texto = scan.nextLine();

        System.out.println("Digite uma palavra específica que queira encontrar neste texto:");
        String pista = scan.nextLine();

        int resultado = texto.indexOf(pista);

        if(resultado != -1){
            System.out.println("A palavra encontrada está na posição " + resultado);
        }else{
            System.out.println("A palavra digitada não foi encontrada.");
        }

        scan.close();
    }
}
