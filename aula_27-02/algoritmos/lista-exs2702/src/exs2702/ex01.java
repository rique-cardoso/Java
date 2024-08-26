package exs2702;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        if(numero < 0){
            System.out.println("Este número é negativo.");
        }else{
            System.out.println("Este número é positivo");
        }

        scan.close();
    }
}
