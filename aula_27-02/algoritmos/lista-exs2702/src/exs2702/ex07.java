package exs2702;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota da avaliação 1: ");
        float avaliacao1 = scan.nextFloat();

        System.out.println("Digite a nota da avaliação 2: ");
        float avaliacao2 = scan.nextFloat();
        
        float media = (avaliacao1 + avaliacao2) / 2;

        if(media >= 6){
            System.out.println("Sua média é " + media + ", você foi aprovado!");
        }else{
            System.out.println("Sua média é " + media + ", você foi reprovado!");
        }

        scan.close();
    }
}
