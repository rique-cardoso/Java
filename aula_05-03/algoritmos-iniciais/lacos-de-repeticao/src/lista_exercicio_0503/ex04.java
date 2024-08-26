package lista_exercicio_0503;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = scan.nextInt();
        if(n > 0){
            for(int i = n; i >= 0; i--){
                System.out.println(i);
            }
        }else{
            System.out.println("NÚMERO INVÁLIDO");
        }
        scan.close();
    }
}
