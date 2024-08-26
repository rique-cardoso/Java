package main;

import java.util.Scanner;

public class Main02{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite sua idade em anos: ");
        int anos = scan.nextInt();

        System.out.println("Digite os meses: ");
        int meses = scan.nextInt();

        System.out.println("Digite os dias: ");
        int dias = scan.nextInt();

        int totalDias = anos * 365 + meses * 30 + dias;

        System.out.println("Total de dias vividos: " + totalDias);
        
        scan.close();
    }
}