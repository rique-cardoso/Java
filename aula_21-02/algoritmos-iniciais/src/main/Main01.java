package main;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva um número:");
        int valor = entrada.nextInt();

        int antecessor = valor - 1;
        int sucessor = valor + 1;

        System.out.println("Antecessor: " + antecessor + "\n" + "Sucessor: " + sucessor);

        entrada.close();
    }
}