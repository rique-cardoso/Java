package exs2702;

import java.util.Scanner;

public class ex05 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();

        if(idade < 0){
            System.out.println("Valor digitado inválido.");
        }else{
            if (idade <= 12) {
                System.out.println("Você é uma criança.");
            } else if (idade > 12 && idade <= 17 ){
                System.out.println("Você é um adolescente.");
            } else if(idade > 17 && idade <= 59){
                System.out.println("Você é um adulto.");
            } else{
                System.out.println("Você é um idoso.");
            }
        }

        scan.close();
    }
}
