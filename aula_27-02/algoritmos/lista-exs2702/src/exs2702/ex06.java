package exs2702;

import java.util.Scanner;

public class ex06 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas maçãs foram compradas?");
        float qtd_macas = scan.nextFloat();
        
        if(qtd_macas < 0){
            System.out.println("Valor inválido.");
        }else{
            if (qtd_macas < 12) {
                System.out.printf("O valor total é R$%.2f" , (qtd_macas * 1.3));
            }else{
                System.out.printf("O valor total é R$%.2f" , qtd_macas);
            }
        }

        scan.close();
    }
}
