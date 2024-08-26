package exs2702;

import java.util.Scanner;

public class java10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = scan.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println("Primeiro é maior");
        }else if(num1 < num2){
            System.out.println("O segundo é maior");
        }else{
            System.out.println("São iguais.");
        }

        scan.close();
    }
}
