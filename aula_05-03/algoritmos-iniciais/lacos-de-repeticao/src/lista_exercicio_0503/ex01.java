package lista_exercicio_0503;

import java.util.Scanner;

public class ex01{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int n = scan.nextInt();
        if(n > 0 == true){
            for(int i = 1; i <= n; i++){
                System.out.println(i);
            }
        }else{
            System.out.println("Número inválido!");
        }
        scan.close();
    }
}