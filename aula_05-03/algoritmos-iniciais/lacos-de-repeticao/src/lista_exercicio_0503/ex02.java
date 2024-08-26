package lista_exercicio_0503;

import java.util.Scanner;

public class ex02 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        int verificador = 0;
        do {
            System.out.println("Digite um número:");
            int n = scan.nextInt();
            if(n > 0 == true){
                for(int i = 1; i <= n; i++){
                    System.out.println(i);
                }
                verificador = 1;
            }
        } while (verificador < 1);
        scan.close();
    }
}
